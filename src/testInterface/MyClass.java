package testInterface;

/**
 * Created by hzq on 16-10-14.
 */
public class MyClass implements MyInterface{

    @Override
    public void test01() {
        System.out.println("test01");
    }

    @Override
    public int test02(int a, int b) {
        System.out.println("test02");
        return a+b;
    }
}





