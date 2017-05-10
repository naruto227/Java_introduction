package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 采用一个指定的规则让其排序
 * Created by Michael Allan on 2017/5/7.
 */
public class TestTreeSet2 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>(new MyComparator());//倒序输出

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("A");
        System.out.println(set);
    }
}

class MyComparator implements Comparator<String>{//默认是Object对象，此处修改为<String>

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
