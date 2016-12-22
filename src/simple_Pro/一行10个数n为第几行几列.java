package simple_Pro;

import java.util.Scanner;

/**
 * 1	2	3	4	5	6	7	8	9	10
 * 11	12	13	14	15	16	17	18	19	20
 * 21	22	23	24	25	26	27	28	29	30
 * Created by hzq on 16-12-22.
 */
public class 一行10个数n为第几行几列 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println(n);
            for (int i = 1; i <= n; i++) {
                if (i % 10 == 0) {
                    System.out.println(i);
                    continue;
                }
                System.out.print(i);
                System.out.printf("\t");
            }
            int row, col;
            int temp = n % 10;
//            row = n / 10 + 1;

            if (temp == 0) {
                col = 10;
                row = n / 10;
            } else {
                col = temp;
                row = n / 10 + 1;
            }
            System.out.println("数字：" + n + ",位于第" + row + "行," + "第" + col + "列");
        }
    }
}
