package polymophism;

/**
 * Created by hzq on 16-10-13.
 */
public class Animal {
    String str;
    public void voice(){
        System.out.println("普通动物叫声");
    }

    /*public void catchMouse() {

    }*/
}

class Cat extends Animal{
    public void voice(){
        System.out.println("喵喵喵");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal{//类继承
    public void voice(){//方法重写
        System.out.println("汪汪汪");
    }
    public void seeDoor(){
        System.out.println("看门");
    }
}

class Pig extends Animal{
    public void voice(){
        System.out.println("哼哼哼");
    }
}