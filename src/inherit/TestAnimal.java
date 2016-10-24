package inherit;

/**
 * Created by hzq on 16-10-11.
 */
public class TestAnimal {
    public static void main(String[] args) {
        Paxing paxing = new Paxing();
        /**
        * main中的对象paxing继承自Animal类,再上一级为Object对象。
         * 对象paxing先往Animal类中查找方法，若没有，继续向上一级查找
        * */
        System.out.println(paxing.toString());
        paxing.run();
        paxing.eat();
        Birds birds = new Birds();
        birds.run();
        Mammal mammal = new Mammal();
        mammal.taiSheng();
    }
}
