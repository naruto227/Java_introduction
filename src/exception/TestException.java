package exception;

import java.util.Scanner;

/**
 * Created by hzq on 16-10-23.
 */
public class TestException {
    public static void main(String[] args) {
//        int i = 1/0;
        try {
            Thread.sleep(1000);//延迟3秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Computer c = new Computer();
        c.start();  //对象是null，调用了对象的方法或属性！ NullPointerException

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(a);
    }
}

class Computer{
    void start(){
        System.out.println("计算机启动！");
    }
}