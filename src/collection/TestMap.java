package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map的基本用法
 * Created by hzq on 16-10-29.
 */
public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("黄志强", new Wife("hh"));
        map.put("邓燚", new Wife("李美玲"));
        map.put("邓燚", new Wife("李玲"));

        Wife w = (Wife) map.get("邓燚");  //w.name.value[0]   李
        map.remove("邓燚");
        System.out.println(map.containsKey("黄志强"));
        System.out.println(w.name);
    }
}

class Wife{
    String name;

    public Wife(String name) {
        this.name = name;
    }
}