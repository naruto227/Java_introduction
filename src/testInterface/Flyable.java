package testInterface;

/**
 * Created by hzq on 16-10-14.
 */
public interface Flyable {
    int MAX_SPEED = 11000;
    int MAX_HIGH = 10000;

    void fly();
}

interface Attack {
    void attack();
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("飞机依靠发动机来发动");
    }
}

class Man implements Flyable {

    @Override
    public void fly() {
        System.out.println("跳起来，飞！");
    }
}

/**
 * 同一个类可以实现多个接口
 */
class Stone implements Flyable, Attack {

    @Override
    public void fly() {
        System.out.println("被人扔出去，飞！");
    }

    @Override
    public void attack() {
        System.out.println("石头攻击！");
    }

    public static void main(String[] args) {
        Stone stone = new Stone();
        Plane plane = new Plane();
        Man man = new Man();
        man.fly();
        plane.fly();
        stone.fly();
        stone.attack();
    }
}