package testWrappedClass;

/**
 * 八种包装类
 * Created by hzq on 16-10-20.
 */
public class test01 {
    public static void main(String[] args) {
        Integer i = new Integer(1000);//将1000包装成一个对象。传1000到构造器，value值为1000，返回
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toHexString(i));
        Integer i2 = Integer.parseInt("234");
        Integer i3 = new Integer("333");
        System.out.println(i2.intValue());

        String str = 234 + "";//数字转换成字符串
    }
}
