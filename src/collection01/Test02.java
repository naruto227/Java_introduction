package collection01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hzq on 16-10-31.
 */
public class Test02 {

    public static void main(String[] args) {
//        一个map对象对应一行记录
        Map map = new HashMap();
        map.put("id", 0301);
        map.put("name", "hzq");
        map.put("salary", 3000);
        map.put("department", "业务部");
        map.put("hireDte", "2015-12");

        Map map1 = new HashMap();
        map1.put("id", 0302);
        map1.put("name", "gc");
        map1.put("salary", 3500);
        map1.put("department", "宣传部");
        map1.put("hireDte", "2015-12");

        Map map2 = new HashMap();
        map2.put("id", 0303);
        map2.put("name", "dy");
        map2.put("salary", 4000);
        map2.put("department", "项目部");
        map2.put("hireDte", "2015-11");

        List<Map> list = new ArrayList<Map>();

        list.add(map);
        list.add(map1);
        list.add(map2);

        printEmpSalary(list);
    }

    public static void printEmpSalary(List<Map> list){
        for (int i = 0; i < list.size(); i++){
            Map temp = list.get(i);
            System.out.println(temp.get("name") + "--" + temp.get("salary"));
        }
    }
}
