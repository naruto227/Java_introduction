package collection;

import java.util.LinkedList;

/**
 * 自定义Map的升级版
 * 1、提高查询效率
 * 2、Map底层实现：数组 + 链表
 * Created by hzq on 16-10-31.
 */
public class MyMap02 {

    //    MyEntry[] arr = new MyEntry[1000];  //m.arr.length = 1000
    LinkedList[] arr = new LinkedList[1000];
    int size;   //实际有效数字的长度

    public void put(Object key, Wife value) {
//        System.out.println(key.hashCode());
        MyEntry e = new MyEntry(key, value);
        int a = key.hashCode() % 1000;
//        此处有些不理解
        if (arr[a] == null) {
            LinkedList list = new LinkedList();
            arr[a] = list;
            list.add(e);
        } else {
            LinkedList list = arr[a];
            for(int i = 0; i < list.size(); i++){
                MyEntry e2 = (MyEntry) list.get(i);
                if(e2.key.equals(key)){ //键值重复，直接覆盖
                    e2.value = value;
                    return;
                }
            }
            arr[a].add(e);
        }
//        a:1000-->1    b:10000-->13
//        arr[a] = e;
    }

    public Object get(Object key) {
//        return arr[key.hashCode() % 1000];
        int a = key.hashCode() % 1000;  //以其hashCode作为其下标
        if(arr[a] != null){
            LinkedList list = arr[a];   //得到数组对象啦
//            遍历这个list里面所有的key
            for(int i = 0; i < list.size(); i++){
                MyEntry e = (MyEntry) list.get(i);
                if(e.key.equals(key)){
                    return e.value;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MyMap02 m = new MyMap02();
        m.put("黄志强", new Wife("杨幂"));
        m.put("邓燚", new Wife("李玲"));
        m.put("邓燚", new Wife("李美玲"));

        m.put("张三", new Wife("李四"));
        Wife m1 = (Wife) m.get("邓燚");
        System.out.println(m1.name);
    }
}
