package myCollection;

import java.util.ArrayList;
import java.util.Objects;

/**
 * 模拟实现JDK中提供的ArrayList类
 * Created by hzq on 16-10-18.
 */
public class MyArrayList {
    /**
     * The value is used for object storage.
     */
    private Object[] value;

    /**
     * The size is the number of objects used.
     */
    private int size;

    public MyArrayList() {
//        value = new Object[16];
        this(16);//调用另一个构造方法
    }

    public int getSize(){
        return size;
    }

    public int getLength(){
        return value.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexof(Object obj){
        if(obj == null){
            return -1;
        }else {
            for(int i = 0; i > value.length; i++){
                if(obj == value[i])
                    return i;
            }
        }
        return -1;
    }

    public int LastIndexOf(Object obj){
        if(obj == null){
            return -1;
        }else {
            for(int i = value.length - 1; i >= 0 ; i--){
                if(obj == value[i])
                    return i;
            }
        }
        return -1;
    }

    public Object set(int index, Object obj) {
        rangeCheck(index);

        Object oldValue = value[index];
        value[index] = obj;
        return oldValue;
    }

    public MyArrayList(int size) {
//        this.size = size;
        if(size < 0){
            throw new ExceptionInInitializerError();
        }
        value = new Object[size];
    }

    public void add(Object obj){
        value[size] = obj;
        size++;
        if(size >= value.length){
            //装不下了，扩容吧
            int newlength = value.length * 2;
            //将原来value的值赋给新对象
           /* System.arraycopy(Object src,  int  srcPos,
            Object dest, int destPos,
            int length);*/
            Object[] newvalue = new Object[newlength];
            for(int i = 0; i < value.length; i++){
                newvalue[i] = value[i];
            }
            value = newvalue;
        }
    }

    public Object get(int index){
        rangeCheck(index);
        return value[index];
    }

    public void rangeCheck(int index){
        if(index < 0 || index >= size){
            try {
                throw new Exception();//不符合规范的index，抛出异常
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(2);
        list.add("haha");
        list.add(new Human("黄志强"));
        list.add(new Human("黄"));
        list.add("dodo");
        list.add(233);//包装类
        list.add(new Human("黄"));
        list.add("dodo");

        System.out.println(list.get(0));
        Human h = (Human) list.get(1);
        System.out.println(h.name);

        System.out.println("现在的容器空间为：" + list.getLength() + "\n实际大小为：" + list.getSize());
        ArrayList list2;
//        System.out.println(list.get(-1));
        /*for (myCollection.MyArrayList i: list
             ) {

        }*/
    }
}
