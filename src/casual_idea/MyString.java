package casual_idea;

import java.util.Scanner;

/**
 * Created by Michael Allan on 2017/5/3.
 */
public class MyString {
    private static int temp;
//    private static String pw;

    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        StringBuilder pw = new StringBuilder();
        System.out.println('a' + 1);//"a"+1结果为a1,'a'+1结果为98
        //abcdefghijklmnopqrstuvwxyz
        for (char i = 'a'; i <= 'z'; i++) {
            res.append(i);
        }
        String str = res.toString().toUpperCase();//转变为大写

        System.out.println(str);
        for (int i = 0; i < 10; i++) {
            res.append(i);
        }
//        System.out.println((int)(Math.random()*10));
        res = res.append(str);
        int length = res.length() - 1;
        System.out.println(res);

        System.out.print("请输入您想要生成几位的随机验证码：");

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            temp = scanner.nextInt();
            System.out.println(temp);
            for (int i = 0; i < temp; i++) {
                pw.append(res.charAt((int) (Math.random() * length)));
            }
            System.out.println("生成的验证码为：" + pw);
            System.out.print("请输入您想要生成几位的随机验证码：");
        }
    }
}
