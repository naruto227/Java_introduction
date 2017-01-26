package object;

/**
 * equals方法实现的功能是判断两个对象的内容是否相同
 * Created by Michael Allan on 2017/1/23.
 */
public class MyEquals {
    /**
     * 对象成员变量
     */
    String name;
    /**
     * 基本数据类型成员变量
     */
    int n;

    /**
     * 判断对象内容是否相同
     *
     * @param obj 需要比较的对象
     * @return
     */
    public boolean equals(Object obj) {
//        如果比较的内容是自身
        if (obj == this) {
            return true;
        }
//        对象类型不同
        if (!(obj instanceof MyEquals)) {
            return false;
        }
//转换成当前类类型
        MyEquals m = (MyEquals) obj;
/**
 * 依次比较对象中每个变量
 */
//name属性不同
        if (!name.equals(m.name)) {
            return false;
        }
//n属性不同
        if (!(n == m.n)) {
            return false;
        }
//如果都相同，则返回true
        return true;
    }
}
/*在实际比较时，首先判断是否是自身，然后再判断对象的类型是否符合要求，可以使用instanceof关键字进行判断，该运算符的语法格式为：
                            对象名 instanceof 类名*/