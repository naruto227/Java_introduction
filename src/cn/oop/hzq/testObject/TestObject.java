package cn.oop.hzq.testObject;

/**
 * Created by hzq on 16-10-11.
 */
public class TestObject {
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = new Object();
        System.out.println(obj.toString());
        System.out.println(obj2.toString());
        System.out.println(obj == obj2);
        System.out.println(obj.equals(obj2));
        Mobile mobile = new Mobile();
        System.out.println(mobile.toSring());
    }
}
