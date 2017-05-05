package add_something;

/**
 * Created by hzq on 16-12-22.
 */
public class Test {
    public static void main(String[] args) {

        String s = "11111111_11111111_11111111_11111011";
        StringBuffer s1 = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {//'1'字符
                s1.append('0');
            } else if (s.charAt(i) == '0') {
                s1.append('1');
            } else {
                s1.append(s.charAt(i));
            }
        }
        System.out.println(s + "的0、1交换后的结果为：\n" + s1);

        int n = 6;
        boolean b = (n < 8) && ((n = 10) != 0);
        int m = 20;
        boolean b1 = (m < 8) && ((m = 1) != 0);

        System.out.println(b);
        System.out.println(b1);

        int a = 4;//正数的补码就是其原码0b100
        int c = ~a;//4的原码：00000000_00000000_00000000_00000100  取反~4后： 11111111_11111111_11111111_11111011 再求它的补码：10000000_00000000_00000000_00000101，即得-5
        System.out.println(a + " " + c);
    }
}
