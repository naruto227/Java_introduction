package testArray;

/**
 * Created by hzq on 16-10-15.
 */

/**
 * 数组是相同数据类型的有序集合
 * 数组也是对象，数组元素相当于对象的成员变量
 * 数组长度是确定的、不可变的。如果越界，则报错
 */
public class test01 {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 32;
        a[2] = 8;
//        a[3] = 46;
        double[] b = new double[2];
        Car[] cars = new Car[4];
        cars[0] = new Car("奔驰");
        cars[1] = new Car("宝马");
        cars[2] = new Car("大众");
        cars[3] = new Car("比亚迪");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
//        增强的for循环
        for (Car i :
                cars) {
            System.out.println(i.name);
        }
        for (int i :
                a) {
            System.out.println(i);
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].name);
        }
    }
}
