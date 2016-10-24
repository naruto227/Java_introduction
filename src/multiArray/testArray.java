package multiArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hzq on 16-10-19.
 */
public class testArray {
    public static void main(String[] args) {
//        System.out.println(args[0]);
        int[] a = {12, 3, 100, 38, 45, 38, 10, 58};
        Scanner scanner = new Scanner(System.in);//创建一个输入流
        System.out.println("请输入数组元素个数：");
        /**
         * 持续输入*/
        while (scanner.hasNext()) {
//            System.out.println("请输入数组元素个数：");
            int n = scanner.nextInt();
            int[] ints = new int[n];
            for (int i = 0; i < n; i++) {
                ints[i] = (int) (Math.random() * 1000);
            }
            System.out.println(Arrays.toString(ints));
            System.out.println("请输入数组元素个数：");
        }
        Arrays.sort(a);
        System.out.println(a);
        System.out.println(Arrays.toString(a));//打印数组或用遍历
//        Object 的toString方法 和 Arrays 的toString方法

        System.out.println("该元素的索引：" + Arrays.binarySearch(a, 38));//在数组a中查找38这个元素 二分查找
        /**
         * Arrays.fill()*/
    }
}
