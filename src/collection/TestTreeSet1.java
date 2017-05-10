package collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet使用元素的自然顺序对元素进行排序，或者根据创建 set 时提供的 Comparator 进行排序，具体取决于使用的构造方法。
 * 通俗一点讲，就是可以按照排序后的列表显示，也可以按照指定的规则排序
 * Created by Michael Allan on 2017/5/7.
 */
public class TestTreeSet1 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("f");
        set.add("f");
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        System.out.println(set);
    }
}
