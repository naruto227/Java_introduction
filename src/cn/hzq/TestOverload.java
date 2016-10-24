package cn.hzq;

/**
 * 测试重载
 * Created by hzq on 16-10-10.
 */
public class TestOverload {
    public static void main(String[] args) {
        MyMath m = new MyMath();
        int result = m.add(4, 6);
        System.out.println(result);
        System.out.println(m.add(4, 5, 10));
        System.out.println(m.add(4.8,10));
    }
}

class MyMath {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(double a, int b) {
        return (int) (a + b);
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
