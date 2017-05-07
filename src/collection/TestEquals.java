package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hzq on 16-10-31.
 */
public class TestEquals {
    List list = new ArrayList();
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    public static void main(String[] args) {
        List list = new ArrayList();
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        list.add(s1);
        list.add(s1);
        System.out.println(list.size());

        Map map = new HashMap();
//        键不能重复
        map.put(s1,"AAAA");
        map.put(s2,"BBBBBBB");
        System.out.println(map.get("aaa")+ " "+ map.size());
    }
}
