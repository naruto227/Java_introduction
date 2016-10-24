package testWrappedClass;

/**
 * 测试自动装箱和拆箱
 * Created by hzq on 16-10-20.
 */
public class test02 {
    public static void main(String[] args) {
        Integer a = 1000;//jdk5.0后，允许这样写，将1000自动转为对象；自动装箱，编译器帮助我们转为Integer a = new Integer(1000);
        int c = new Integer(1500);//编译器改进，new Integer(1500).intValue();
/**
        Integer b = null;
        int d = b;//Exception in thread "main" java.lang.NullPointerException。b.intValue()
*/
        Integer d1 = 1234;
        Integer d2 = 1234;
        System.out.println(d1 == d2);//false
        System.out.println(d1.equals(d2));//true

        System.out.println("############################");
        Integer d3 = 123;//[-128,127]之间的数，仍然当作基本的数据类型类处理int IntegerCache
        Integer d4 = 123;
        System.out.println(d3 == d4);//true
        System.out.println(d3.equals(d4));//true
    }

}
