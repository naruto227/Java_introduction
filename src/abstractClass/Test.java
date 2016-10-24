package abstractClass;

/**
 * Created by hzq on 16-10-14.
 */
public class Test {
    public static void main(String[] args) {
        //Animal animal = new Animal();//抽象类不能被实例化
        Animal animal = new Cat();
        animal.breath();
    }

}
