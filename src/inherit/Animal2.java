package inherit;

/**
 * 使用组合来实现代码复用
 * Created by hzq on 16-10-11.
 */
public class Animal2 {
    String eye;

    public void run() {
        System.out.println("跑跑！");
    }

    public String getName() {
        return getClass().getName();
    }

    public void eat() {
        System.out.println("吃吃！");
    }

    public Animal2(){
        System.out.println("创建一个动物");
    }

    public static void main(String[] args) {
        Birds2 b = new Birds2();
        b.run();
        b.eat();
    }
}

class Mammal2 {
    Animal2 animal2 = new Animal2();

    public void taiSheng() {
        System.out.println("我是胎生");
    }
}

class Paxing2 {
    Animal2 animal2 = new Animal2();

}

class Birds2 extends Animal2 {
    Animal2 animal2 = new Animal2();

    public void run() {
//        System.out.println(getName());
        animal2.run();
        System.out.println("我是一只鸟，飞呀飞更高");
    }

    @Override
    public void eat() {
        System.out.println("吃啥吃啊");
    }

    public Birds2() {
        super();
        System.out.println("创建一只鸟对象");
    }

}
