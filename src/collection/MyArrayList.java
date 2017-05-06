package collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 自己实现一个ArrayList，帮助更好的理解ArrayList类的底层结构！
 * Created by hzq on 16-10-27.
 */
public class MyArrayList /*implements List*/ {

    private Object[] elementData;
    private int size;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        elementData = new Object[initialCapacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(int index, Object o) {
        rangeCheck(index);
        if (size == elementData.length) {
            ensureCapacity();
        }
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = o;
        size++;
    }

    public void add(Object obj) {
        if (size == elementData.length) {
            ensureCapacity();
        }
        elementData[size++] = obj;
    }

    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    public void remove(int index) {
//        删除指定位置的对象
        rangeCheck(index);
        /*for(int i = index; i < size; i++){
            elementData[i] = elementData[i+1];
        }*/
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index + 1, elementData, index,
                    numMoved);
        elementData[--size] = null; //let gc do its work
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (int index = 0; index < size; index++) {
                if (elementData[index] == null) {
                    remove(index);
                    return true;
                }
            }
        } else {
            for (int index = 0; index < size; index++) {
                if (o.equals(elementData[index])) {  //只需要判断内容相同即可，用equals
                    remove(index);
                    return true;
                }
            }
        }
        return false;
    }

    //    替换原来的老值
    public Object set(int index, Object o) {
        rangeCheck(index);
        Object oldValue = elementData[index];
        elementData[index] = o;
        return oldValue;
    }

    //        数组扩容和数据的拷贝
    private void ensureCapacity() {
        Object[] newArray = new Object[size * 2 + 1];
        System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            /*for (int i = 0; i < elementData.length; i++) {
                newArray[i] = elementData[i];
            }*/
        elementData = newArray;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            strings.add(null);
        }
        MyArrayList list = new MyArrayList(3);
        list.add("333");
        list.add("111");
        list.add("111");
        list.add(null);
        list.add(222);
        list.add(null);
        list.add(null);
        list.add(1,"hzq");

//        list.add("22");
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.remove(4); //删除第几个元素
        System.out.println(list.get(3));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的对象元素：");
        String str = scanner.next();
        if (list.remove(str)) {    //删除某一个对象
            System.out.println("删除成功");
            System.out.println(list.size());
        } else {
            System.out.println("删除失败");
        }
        System.out.println("get到元素："+list.get(4));

    }
}
