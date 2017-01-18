package abstractClass;

/**
 * Created by hzq on 17-1-18.
 * 接口声明的示例代码如下，例如声明一个USB接口来代表实际使用中的USB结构：
 */
public interface USB {
    /**电压*/
    public static final int V = 5;
    /**读取数据*/
    public abstract byte[] readData();
    /**写入数据*/
    public abstract void writeData(byte[] data);
}
/*该接口中规定电压常量为5V，声明了两个方法，要求实现USB时必须实现这样两个方法，至于如何实现这里不做规定。*/