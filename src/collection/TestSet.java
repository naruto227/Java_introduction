package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试Set的常用方法
 * Created by hzq on 16-10-31.
 */
public class TestSet {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add(new String("aaa"));
        System.out.println(set.size());
        set.remove("aaa");

        System.out.println(set.contains("aaa"));
    }
}
