package testStringBuilder;

/**
 * 测试可变字符序列。StringBuilder(线程不安全，效率高)，StringBuffer(线程安全，效率低)
 * Created by hzq on 16-10-17.
 */
public class test01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();//字符數組長度初始爲16
        StringBuilder sb1 = new StringBuilder(32);//字符数组长度初始爲32
        StringBuilder sb2 = new StringBuilder("abcd");//字符数组长度初始爲32，value[] = {'a','b','c','d',\u0000.....}
        sb2.append("efg");
        sb2.append(true).append(321).append("我要畢業");//通過return this實現鏈
        System.out.println(sb2);
        System.out.println("*********************");
        StringBuilder gh = new StringBuilder("a");
        for(int i = 0; i < 10; i++){
            gh.append(i);
        }
        System.out.println(gh);
    }
}
