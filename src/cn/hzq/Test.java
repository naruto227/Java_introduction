package cn.hzq;

import java.util.Scanner;

/**
 * Created by hzq on 16-10-10.
 */
public class Test {
    public static void main(String[] args) {
        //通过类加载器Class Loader加载Studet类。加载后，在方法区中就有了Student类的信息
        Student stu1 = new Student();
        Student stu2 = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个名字：");
        stu2.name = scanner.next();
        stu1.study();
        System.out.println("请输入另一个人名字：");
        stu1.sayHello(scanner.next());
        System.out.println("请输入第三个人名字：");
        stu1.name = scanner.next();
        stu2.study();

        Computer computer = new Computer();

        stu2.computer = computer;
        computer.brand = "联想";
        computer.brand = "戴尔";
        System.out.println(stu2.computer.brand);
        String str = "戴尔";
        System.out.println(str == stu2.computer.brand);
//        str.equals()
    }
}
