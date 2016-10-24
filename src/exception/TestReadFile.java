package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by hzq on 16-10-23.
 */
public class TestReadFile {
    public static void main(String[] args) {
        FileReader reader = null;//声明一个全局变量
        try {

            reader = new FileReader("/home/hzq/txt");
            char temp = (char) reader.read();
            char temp1 = (char) reader.read();
            char temp2 = (char) reader.read();
            char temp3= (char) reader.read();

            System.out.println("读出的内容：" + temp + temp1 + temp2 + temp3);
        } catch (FileNotFoundException e) { //catch 捕获多个异常
            System.out.println("文件没有找到！！！");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("读取文件错误！！！");
            e.printStackTrace();
        }finally {  //通常在finally中关闭已经打开的资源,finally不能执行return
            System.out.println("不管有没有错误，我肯定会被执行！");
            try{
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
