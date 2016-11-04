package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型 <>
 * 1、泛型：标签，泛化类型
 * 2、作用：省心、安全
 * 适用于对多种数据类型执行相同功能的代码
 * 泛型不能使用在静态属性上
 * 指定的类型不能是基本类型
 * Created by hzq on 16-11-1.
 */
public class Test01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("so easy");

    }
}
