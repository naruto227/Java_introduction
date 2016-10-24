package cn.hzq;

import java.util.Scanner;

/**
 * 测试静态方法
 * Created by hzq on 16-10-10.
 */
public class TestStatic {
    int id;
    static int num;
    String str;

    public static void print(){
//        doit(); Error:(14, 9) java: 无法从静态上下文中引用非静态 方法 doit()
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入num=");
        num = scanner.nextInt();
        System.out.println("num=" + num);//对
//        System.out.println(id); 错误
    }

    public void doit(){
        print();//非静态 方法可以引用 静态方法 print()
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入id=");
        id = scanner.nextInt();
        System.out.println("id=" + id + "\nnum=" + num);
    }

    public static void main(String[] args) {
        TestStatic testStatic = new TestStatic();
        testStatic.print();
        testStatic.doit();
    }
}
