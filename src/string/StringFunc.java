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
        c = s.chatAt(1);
    }
}
