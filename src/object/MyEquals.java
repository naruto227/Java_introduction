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
     * @param obj 需要比较的对象
     * @return
     */
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(!(obj instanceof MyEquals)){
            return false;
        }

        MyEquals m = (MyEquals) obj;

        if(!name.equals(m.name)){
            return false;
        }

        if(!(n== m.n)){
            return false;
        }

        return true;
    }
}
