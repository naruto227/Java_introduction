package collection;

import java.util.HashMap;

/**
 * 定义自己的HashSet
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
        System.out.println(s.size());
    }
}
