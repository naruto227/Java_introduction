package testArray;

/**
 * 数组的基本语法
 * Created by hzq on 16-10-15.
 */
public class test02 {
    public static void main(String[] args) {
        //数组声明
        int[] a;
        int b[];

        //创建数组对象
        a = new int[4];
        b = new int[5];

        //初始化（对数组元素初始化）
        //默认初始化，数组元素相当于对象的成员变量，默认值跟成员变量的规则一致，数字0，布尔false，char \u0000，引用:null
        //动态初始化
        /*a[0] = 23;
        a[1] = 45;*/
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 12;
        }

        //静态初始化
        int c[] = {23, 43, 58, 78};//长度为4，索引范围[0,3]
        Car[] cars = {
                new Car("奔驰"),
                new Car("比亚迪"),
                new Car("宝马")
        };
        Car c2 = new Car("奔驰");
        System.out.println("c2.toString()：" + c2.toString() + "   cars[0].toString()：" + cars[0].toString());
        System.out.println(c2 == cars[0]);

        char[] s = new char[26];
        for (int i = 0; i < 26; i++) {
            System.out.print('A' + i + "  ");//'A'或"A"这两种的结果不一样的 65  66  67  68  69  70  71  72  73  74  75  76  77  78  79  80  81  82  83  84  85  86  87  88  89  90
        }
    }
}
