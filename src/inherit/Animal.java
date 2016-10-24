package inherit;

/**
 * 使用继承实现代码复用
 * Created by hzq on 16-10-11.
 */
public class Animal {
    String eye;

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public void run(){
        System.out.println("跑跑！");
    }

    public void eat(){
        System.out.println("吃吃！");
    }

    public Animal(){
        super();//首先调用父类方法，隐式方法，调Object
        System.out.println("创建一个动物");
    }

}

class Mammal extends Animal{
    public void taiSheng(){
        System.out.println("我是胎生");
    }
}

class Paxing extends Animal{
    public Paxing() {
    }

    @Override//覆盖，重写
    public void eat() {
        super.eat();//super继承父类方法
    }
}

class Birds extends Animal{
    @Override
    /**
     * 重写父类方法
     * */
    public void run() {
        System.out.println("我是一只鸟，飞呀飞更高");
    }

    public Birds(){
        super();//隐式
        System.out.println("建立一个鸟对象");
    }
}