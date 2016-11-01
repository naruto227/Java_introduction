package iterator;

import java.util.*;

/**
 * boolean  hasNext()   判断是否有元素没有被遍历
 * Object   next()      返回游标当前位置的元素并将游标移动到下一个位置
 * void remove()    删除游标左面的元素，执行完next()之后，该操作只能执行一次
 * Created by hzq on 16-10-31.
 */
public class Test01 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//      通过索引遍历List
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
//      通过迭代器遍历List
        for(Iterator iter2 = list.iterator(); iter2.hasNext();){
            String str = (String) iter2.next();
            System.out.print(str + "\t");
        }
        System.out.println();

        Set set = new HashSet();

        set.add("hzq");
        set.add("dy");
        set.add("gc");
//      通过迭代器遍历set
//        Iterator iter = set.iterator();
//        while (iter.hasNext()){
        for(Iterator iter = set.iterator(); iter.hasNext();){
            String str = (String) iter.next();
            System.out.println(str);
        }
    }
}
