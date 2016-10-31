package collection01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzq on 16-10-31.
 */
public class Test01 {

    public static void main(String[] args) {
        /*Employee e = new Employee();
        e.setId(0301);
        e.setName("hzq");
        e.setDepartment("项目部");
        e.setSalary(3000);
        String strDate = "2007-10";
        DateFormat format = new SimpleDateFormat("yyyy-MM");
        try {
            e.setHireDate(format.parse(strDate));
        } catch (ParseException e1) {
            e1.printStackTrace();
        }*/

        Employee e1 = new Employee(0301, "hzq", 3000, "业务部", "2016-01");
        Employee e2 = new Employee(0302, "gc", 3500, "宣传部", "2015-12");
        Employee e3 = new Employee(0303, "dy", 4000, "项目部", "2015-11");

        List<Employee> list = new ArrayList<>();

        list.add(e1);
        list.add(e2);
        list.add(e3);

        printEmpName(list);
    }

    public static void printEmpName(List<Employee> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName());
        }
    }
}
