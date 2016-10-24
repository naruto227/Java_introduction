package testStringBuilder;

/**
 * String和StringBuilder有什么区别，可以从内存分析，扩容性来谈，往深里说。
 * Created by hzq on 16-10-18.
 */
public class test02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        sb.delete(3,5);//删除了de
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer();//synchronized 锁机制，安全

    }
}
