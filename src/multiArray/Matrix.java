package multiArray;

/**
 * 封装了矩阵的算法
 * Created by hzq on 16-10-18.
 */
public class Matrix {

    public static void print(int[][] c) {
        //        打印矩阵
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] add(int[][] a, int[][] b) {
        //        矩阵加法
        int[][] c = new int[a.length][b.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 3, 3},
                {2, 4, 5},
                {10,10,10}
        };

        int[][] b = {
                {3, 4, 7},
                {5, 6, 10},
                {10,10,10}
        };

        int[][] c = add(a, b);
        print(c);

//        c[0][0] = a[0][0] + b[0][0];
//        System.out.println(c[0][0] + "  " + c[0][1] + "\n" + c[1][0] + "  " + c[1][1]);
    }
}
