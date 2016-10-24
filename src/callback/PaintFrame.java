package callback;

//import jdk.internal.org.objectweb.asm.tree.analysis.Frame;

/**
 * Created by hzq on 16-10-14.
 */
public class PaintFrame {
    //抽象类作为参数类型
    public static void drawFrame(MyFrame f) {
        System.out.println("启动线程");
        System.out.println("增加循环");
        System.out.println("查看消息栈");

        //画窗口
        f.paint();

        System.out.println("启动缓存，增加效率\n");
    }
    //接口作为参数类型
    public static void drawFrame1(IMyFrame f) {
        System.out.println("启动线程");
        System.out.println("增加循环");
        System.out.println("查看消息栈");

        //画窗口
        f.paint();

        System.out.println("启动缓存，增加效率");
    }

    public static void main(String[] args) {
        drawFrame(new GameFrame01());
        drawFrame(new GameFrame02());
        drawFrame1(new GameFrame03());
        drawFrame1(new GameFrame04());
    }
}
/**
 * 使用多态实现，重写了paint方法
 * 抽象类继承*/
class GameFrame01 extends MyFrame{
    public void paint(){
        System.out.println("GameFrame01.paint()");
        System.out.println("画窗口");
    }
}

class GameFrame02 extends MyFrame{
    public void paint(){
        System.out.println("GameFrame02.paint()");
        System.out.println("画窗口");
    }
}

class GameFrame03 implements IMyFrame{
    public void paint(){
        System.out.println("GameFrame03.paint()");
        System.out.println("画窗口");
    }
}

class GameFrame04 implements IMyFrame{
    public void paint(){
        System.out.println("GameFrame04.paint()");
        System.out.println("画窗口");
    }
}