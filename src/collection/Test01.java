package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * 测试List中的基本方法
 * Created by hzq on 16-10-27.
 */
public class Test01 {
    public static void main(String[] args) {
        Collection c;
        List list = new ArrayList();
        /**
         * ArrayList:底层实现数组。所以，查询快，修改插入，删除慢
         * LinkedList:底层实现是链表，线程不安全，效率高。所以，查询慢，修改，插入，删除快
         * Vector:线程安全，效率低。
         */
//        往List里面加入对象
        list.add("aaa");
        list.add(new Date());
        list.add(1234); //包装类的：自动装箱
        list.add(new Dog());

        System.out.println(list.size());
        System.out.println(list.isEmpty());
//        list.remove("aaa");       //hashcode和equals
        System.out.println(list.size());

        List list1 = new ArrayList();

        list1.add("bbb");
        list1.add("ccc");
        list1.add("ddd");
        list.add(list1);
        System.out.println(list.size());

//        和顺序有关的操作
        String str = (String) list.get(0);
        System.out.println(str);

        list.set(1,"ababaa");
        list.remove(0);
    }
}

class Dog{

}
