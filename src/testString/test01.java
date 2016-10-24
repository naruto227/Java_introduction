package testString;

/**
 * 熟练字符串常用方法，结合数组查看源码
 * 提高：将常用方法的源码读读
 * Created by hzq on 16-10-17.
 */
public class test01 {
    public static void main(String[] args) {
//        test01 t = new test01();
        String str = new String("abc");//alue[]数组
        String str2 = new String("abc");//str
        System.out.println(str.charAt(1));
        System.out.println(str.equals(str2));//this == anotherObject，同一个对象，return true
        System.out.println(str == str2);//false
        String str3 = "1231";//双引号的，默认就是字符串对象
        String str4 = "123";
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);
        System.out.println(str3.indexOf('2'));
        System.out.println(str3.substring(1));
        System.out.println(str3.replace('w', '*'));//如果oldChar不存在，返回原始的；如果存在，则替换。

        System.out.println("***********************");

        String str5 = "abcde,fgh,ha/ha=dodo";
        String[] strArray = str5.split(",|=|/");//字符串切割，返回数组 abcde  fgh  ha  ha  dodo
        for (String i : strArray) {
            System.out.print(i + "  ");
        }

        String str6 = "   just do it !  ";
        System.out.println("\n" + str6 + "的原始长度：" + str6.length());
        String strTrim = str6.trim();//去除首位空格
        System.out.println("调用str6后的长度：" + strTrim.length());
        System.out.print("\n" + strTrim);

        System.out.println("Abcd".indexOf('b'));
        System.out.println("Abcd".lastIndexOf('b'));
        System.out.println("Abcd".startsWith("Ab"));
        System.out.println("Abcde".endsWith("cd"));

        System.out.println("AbcdE".toLowerCase());
        System.out.println("AbcdE".toUpperCase());

        System.out.println("***********************");
        String gh = "a";
        for(int i = 0; i < 10; i++){
            gh += i;
        }
        System.out.println(gh);

    }

}
