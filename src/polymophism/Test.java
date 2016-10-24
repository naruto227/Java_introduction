package polymophism;

/**
 * Created by hzq on 16-10-13.
 */
public class Test {
    /**
     * 利用重载做，形参为类对象*/
    /*public static void testAnimalVoice(Cat c){
        c.voice();
    }

    public static void testAnimalVoice(Dog c){
        c.voice();
    }

    public static void testAnimalVoice(Pig c){
        c.voice();
    }*/

    /**
     * 利用多态实现，形参为Animal类对象，方法执行时按最终调用决定
     * 编译时模糊一点，一般是一个父类。运行时具体是哪个子类就是哪个子类，由实际对应的对象类型决定
     * 这里实际传个Animal父类，然后运行时判定具体的子类，调用其方法
     */
    public static void testAnimalVoice(Animal c) {
        c.voice();
        if (c instanceof Cat) {//如果c是Cat类的一个实例化对象
            ((Cat) c).catchMouse();//运行时，先要保证强转为Cat类
        }
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        Animal c1 = new Cat();//父类引用指向子类对象,调用的是父类的方法
        Dog d = new Dog();
        Animal d1 = new Dog();
        testAnimalVoice(c);
        testAnimalVoice(c1);
        testAnimalVoice(d);
        testAnimalVoice(d1);

        Cat c2 = (Cat) c1;//强转，将Animal类转为Cat类
        c2.catchMouse();//调用的是父类的方法

    }
}
