package cn.hzq;

/**
 * Created by hzq on 16-10-10.
 */
public class TestConstructor {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 100;
        car.brand = "BENZ";
        System.out.println(car.speed + "\n" + car.brand);
    }
}
