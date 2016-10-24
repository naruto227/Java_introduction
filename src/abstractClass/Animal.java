package abstractClass;

/**
 * Created by hzq on 16-10-14.
 */
public abstract class Animal {//抽象类
    String str;

    public abstract void run();//抽象方法的意义在于：将方法的设计和方法的实现分离了。

    public void breath(){
        System.out.println("呼吸");
    }

    public Animal(){
        System.out.println("创建一个动物对象");
    }
}
/**
 * 在子类中实现抽象方法，抽象类只能用来被继承
 * */
class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("猫步小跑");
    }
}

class Dog extends Animal{

    @Override
    public void run() {
        System.out.println("狗狗快跑");
    }
}
