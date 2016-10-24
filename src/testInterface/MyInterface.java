package testInterface;

/**
 * Created by hzq on 16-10-14.
 */
public interface MyInterface {
    //接口中只有常量和抽象方法
    /*public static final 写或不写总有这个*/ String MAX_GREAD = "BOSS";
    int MAX_SPEED = 120;

    /*public abstract*/ void test01();
    public int test02(int a, int b);
}
