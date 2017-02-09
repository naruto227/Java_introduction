package string;

/**
 * Created by Michael Allan on 2017/1/27.
 */
public class StringFunc {
    public static void main(String[] args) {
       /*String s = "abc";
       s = "Java语言";
        *//*只是按照面向对象的标准语法，在内存使用上存在比较大的浪费。例如String s = new String("abc");实际上创建了两个String对象，一个是"abc"对象，存储在常量空间中，一个是使用new关键字为对象s申请的空间。*//*
        String s1 = new String("abc");
        s = new String("Java语言");*/

        String s = "abc";
        char c = s.charAt(1);
        System.out.println(c);

        String s1 = "abc";
        String s2 = "abd";
        System.out.println(s1.compareTo(s2));//compareToIgnoreCase，这个方法是忽略字符的大小写进行比较

        String s3 = "abc";
        String s4 = "def";
        System.out.println(s3.concat(s4));
//        使用“+”进行字符串的连接
        String s0 = "abc" + "1234";
        System.out.println(s0);

        int a = 10;
        String a0 = "123" + a + 5;
        System.out.println(a0);
        String a1 = a + 5 + "123";//计算的过程为首先计算a和数字5，由于都是数字型则进行加法运算或者数字值15，然后再使用数字值15和字符串”123”进行连接获得最终的结果。
        System.out.println(a1);
    }
}
