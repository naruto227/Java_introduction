package testDate;

import java.util.Date;

/**
 * 测试Date类的用法
 * Created by hzq on 16-10-20.
 */
public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();
        long t = System.currentTimeMillis();
        Date d1 = new Date(t);
        System.out.println(t);
        System.out.println(d1);

        d1.setTime(123123123);
        System.out.println(d1.getTime());
        System.out.println(d.getTime() < d1.getTime());
    }
}
