package multiArray;

/**
 * Created by hzq on 16-10-18.
 */
public class test01 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {3, 4, 0, 9},
                {7, 6, 5}
        };//二维数组

        int[][] a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[3];

        a[0][0] = 1;
        a[0][1] = 2;

        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 0;
        a[1][3] = 3;
        a[2][0] = 7;

        a[2][1] = 7;
        a[2][2] = 5;
        /**
         * System.out.println(arr[0][2]);
         * 出错：
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
         * */
        System.out.println(arr[0][1]);
//        int t[][] = new int[][4]; 非法
    }
}
