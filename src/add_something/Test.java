package add_something;

/**
 * Created by hzq on 16-12-22.
 */
public class Test {
    public static void main(String[] args) {
        int n = 5;
        boolean b = (n < 8) && ((n = 10) != 0);
        int m = 20;
        boolean b1 = (m < 8) & ((m = 1) != 0);

        System.out.println(b);
        System.out.println(b1);

        int a = 4;
        int c = ~a;
        System.out.println(a + " " + c);
    }
}
