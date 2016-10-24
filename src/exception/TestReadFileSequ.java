package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 执行try……catch,给返回值赋值，但不立即返回，执行finally，return
 * Created by hzq on 16-10-24.
 */
public class TestReadFileSequ {
    public static void main(String[] args) {
        String s = new TestReadFileSequ().openFile();
        System.out.println(s);
    }

    String openFile(){
        System.out.println("aaa");
        try {
            FileInputStream fis = new FileInputStream("/home/hzq/txt");
            int a = fis.read();
            System.out.println("bbb");
            return "step1";
        } catch (FileNotFoundException e) {
            System.out.println("catching!!!");
            e.printStackTrace();
            return "step2";//先确定返回的值，并不会直接结束运行
        } catch (IOException e) {
            e.printStackTrace();
            return "step3";
        }finally {
            System.out.println("finally!!!");
//            return "fff";//不要在finally中执行return
        }

    }
}
