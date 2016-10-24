package testDate;

import java.io.File;
import java.io.IOException;

/**
 * Created by hzq on 16-10-23.
 */
public class TestFile {
    public static void main(String[] args) {
        File f = new File("/home/hzq/文档/Java/Java_introduction/src/testStringBuilder/test01.java");
        File f2 = new File("/home/hzq/文档/Java/Java_introduction/src/testStringBuilder");
        File f3 = new File(f2, "test01.java");
        File f4 = new File("/home/hzq/文档/Java/testFile");
//        File f5 = new File("/home/hzq/文档/Java/testFile/aa/bb/cc/dd");//f5.mkdirs()
        File f5 = new File("/home/hzq/文档/Java/testFile/aa");//直接创建该目录下的aa目录，f5.mkdir()
        try {
            f4.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        f4.delete();//删除文件
        if(f.isFile()){
            System.out.println("是一个文件");
        }
        if(f2.isDirectory()){
            System.out.println("是一个目录");
        }

    }
}
