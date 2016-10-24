package testDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * Created by hzq on 16-10-23.
 */
public class VisualCalendar {
    public static void main(String[] args) {
//        String temp = "2013-5-22";//此处应为输入的时间
        System.out.println("请输入日期（按照格式2016-10-23）：");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(temp);//字符串转为时间格式
            Calendar calendar = new GregorianCalendar();//时间date转化为calendar
            calendar.setTime(date);//把时间加进去

            int today = calendar.get(Calendar.DATE);
            calendar.set(Calendar.DATE, 1);//把日期时间变为1号
            //得到该月的1号本该为周几。如10-01为周六
            System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

            //得到一个月的最多的天数
            System.out.println(calendar.getActualMaximum(Calendar.DATE));

            int count = calendar.get(Calendar.DAY_OF_WEEK);
            int maxDay = calendar.getActualMaximum(Calendar.DATE);

            System.out.println("日\t一\t二\t三\t四\t五\t六");

            for (int i = 1; i < count; i++)
                System.out.printf("\t");

            int j = 8 - count;//计数器，换行
            for (int i = 1; i <= maxDay; i++) {
                //标记当天
                if(i == today){
                    System.out.print("*");
                }
                System.out.print(i + "\t");
//                j++;
                if (i % 7 == j) {
                    System.out.println('\n');
                }
            }
            System.out.println();
            /*for (int i = 1; i <= maxDay; i++) {
                System.out.print(i + "\t");
                //                j++;
                int w = calendar.get(Calendar.DAY_OF_WEEK);
                if (w == Calendar.SATURDAY) {
                    System.out.print('\n');
                }
                calendar.add(Calendar.DATE, 1);
            }*/

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
