package simple_Pro;

import java.util.Scanner;

/**
 * Created by hzq on 16-12-22.
 */
public class 一行10个数n为第几行几列 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println(n);
            int row, col;
            row = n / 10 + 1;
            int temp = n % 10;
            if (temp == 0) {
                col = 1;
            } else {
                col = temp + 1;
            }
            System.out.println("数字：" + n + ",位于第" + row + "行," + "第" + col + "列");
        }
    }
}
