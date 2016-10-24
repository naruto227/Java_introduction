package OuterClass;

/**
 * Created by hzq on 16-10-14.
 */
public class Outer {
    Face f = new Face();

    Face.NOSE n = f.new NOSE();
}

class Face{
    int type;
    //内部类
    class NOSE{
        String type;
        void breath(){
            System.out.println("呼吸！");
        }
    }
}
