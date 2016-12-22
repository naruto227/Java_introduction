package testDate;

import java.io.File;

/**
 * 递归 目录中的文件
 * Created by hzq on 16-10-23.
 */
public class FileTree {
    public static void main(String[] args) {
        File f = new File("/home/hzq/IdeaProjects/animation");
        printFile(f, 0);
    }

    static void printFile(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();//列举所有目录下的子文件呢，放到一个文件数组中
            for (File temp :
                    files) {
                printFile(temp, level + 1);
            }
        }
    }
}
