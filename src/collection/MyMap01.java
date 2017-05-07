package collection;

/**
 * 自定义实现Map的功能
 * Map：存放键值对，根据键对象找对应的值对象
 * Created by hzq on 16-10-29.
 */
public class MyMap01 {
    MyEntry[] arr = new MyEntry[1000];  //m.arr.length = 1000
    int size;   //实际有效数字的长度
//  存放键值对
    public void put(Object key, Object value) {
        MyEntry e = new MyEntry(key, value);
        for(int i = 0; i < size; i++){
            if(arr[i].key.equals(key)){ //如果有该键，覆盖值
                arr[i].value = value;
                return;
            }
        }
        arr[size++] = e;
    }

    public Object get(Object key){
        for(int i = 0; i < size; i++){
            if(arr[i].key.equals(key)){
                return arr[i].value;
            }
        }
        return null;
    }

    public boolean containsKey(Object key){
        for(int i = 0; i < size; i++){
            if(arr[i].key.equals(key)){
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(Object value){
        for(int i = 0; i < size; i++){
            if(((Wife)arr[i].value).name.equals(value)){//对象的属性，Object、Wife
                return true;
            }
        }
        return false;
    }
//((Wife)arr[i].value).name
    public static void main(String[] args) {
        MyMap01 m = new MyMap01();
        m.put("黄志强", new Wife("杨幂"));
        m.put("邓燚", new Wife("李玲"));
        m.put("邓燚", new Wife("李美玲"));

        m.put("张三", new Wife("李四"));
        Wife m1 = (Wife) m.get("邓燚");
        System.out.println(m.containsKey("邓燚"));
        System.out.println(m.containsValue("杨幂"));
        System.out.println(m1.name);
    }
}

class MyEntry {
    Object key;
    Object value;

    //  存放键值对
    public MyEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}