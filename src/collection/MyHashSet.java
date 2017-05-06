package collection;

import java.util.HashMap;

/**
 * 定义自己的HashSet：该容器中只能存储不重复的对象
 * Created by hzq on 16-10-31.
 */
public class MyHashSet {

    HashMap map;
    int size;
    private static final Object PRESENT = new Object();

    public MyHashSet(){
        map = new HashMap();
    }

    public int size(){
        return size;
    }

    public void add(Object o){
        map.put(o,PRESENT); //set的不可重复就是利用了map里面，键对象的不可重复！
        size++;
    }

    public static void main(String[] args) {
        MyHashSet s = new MyHashSet();
        s.add("aaa");
        s.add(new String("aaa"));
        s.add("aaa");
        System.out.println(s.map.size());// 1
        System.out.println(s.size());// 3
    }
}
