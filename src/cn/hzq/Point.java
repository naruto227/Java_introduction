package cn.hzq;

/**
 * Created by hzq on 16-10-10.
 */
public class Point {
    double x, y, z;

    //通过构造方法初始化对象的属性
    public Point(double _x, double _y, double _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    public void set(double _x, double _y, double _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    public double distance(Point p) {    //将点作为输入
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z));
    }

    public static void main(String[] args) {
        Point point = new Point(3, 8, 4);
        Point point1 = new Point(100, 10, 10);
        point.set(10, 10, 10);
        System.out.println("x=" + point.x);
        System.out.println(point.distance(point1));
    }
}
