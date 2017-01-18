package OuterClass;

/**
 * Created by hzq on 16-10-14.
 * 类InnerClass声明在了类OutClass的内部，所以InnerClass被称为内部类，而OutClass则被称为InnerClass的外部类。
 */
public class OuterClass {
    Face f = new Face();

    Face.NOSE n = f.new NOSE();
    int i = 0;
    public class InnerClass{
        public void test(){
            i++;
        }
    }
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
/*该代码编译以后，将生成两个class文件，一个是OutClass.class，另外一个是OutClass$InnerClass.class。这里需要说明的是，内部类也被编译成一个独立的类文件，类文件的名称为：外部类类名$内部类类名.class。*/