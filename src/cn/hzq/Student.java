package cn.hzq;

/**
 * Created by hzq on 16-10-10.
 */
public class Student {
    //静态的数据
    /*private static String name = "hzq"; //static 所有共享一段内存空间
    private int age;
    private String gender;
    private int id; //学号
    private float weight;*/
    static String name = "hzq"; //static 所有共享一段内存空间
    int age;
    String gender;
    int id; //学号
    float weight;
    Computer computer;//类作为一种类型

    //动态的行为
    public void study(){
        System.out.println(name + "在学习");
    }

    public void sayHello(String name2){
        System.out.println(name + "向" + name2 + "说：你好！");
    }



    /*public static void main(String[] args) {
        //通过类加载器Class Loader加载Studet类。加载后，在方法区中就有了Student类的信息
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu2.name = "黄志强";
        stu1.study();
        stu1.sayHello("高超");
        stu1.name = "dy";
        stu2.study();
    }*/
}
