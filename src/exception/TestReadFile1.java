package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by hzq on 16-10-24.
 */
public class TestReadFile1 {
    public static void main(String[] args) {
        String s = null;
        try {
            s = new TestReadFile1().openFile();//谁调用谁加try……catch
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }

    String openFile() throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("/home/hzq/txt");
        char a = (char) fis.read();
        System.out.println();
        return "";
    }
}
