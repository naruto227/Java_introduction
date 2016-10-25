package MyGame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 测试窗口物体沿着任意角度移动
 * 最后形成一个小的台球游戏
 * Created by hzq on 16-10-24.
 */
class GameFrame03 extends Frame {  //GUI编程：AWT,swing等

    Image img = GameUtil.getImage("images/lADOff4-9ygo_40_40.jpg_620x10000q90g.jpg");//图片路径src下

    private double x = 100, y = 100;
    private double degree = 3.14 / 3;  //[0,2pi]
    private double speed = 10;

//    @Override
//    public void paint(Graphics g) {
//
//        g.drawImage(img, (int) x, (int) y, null);   //在窗口上重画图片
//
//        if(speed > 0){
//            speed -= 0.05;
//        }/*else {
//            speed = 0;
//        }*/
//
//        x += speed * Math.cos(degree);
//        y += speed * Math.sin(degree);
//
//        if (y > 500 - 30 || y < 30) {
//            degree = -degree;
//        }
//        /*if (y < 30) {
//            degree = -degree;
//        }*/
//        if (x < 0 || x > 500 - 30) {
//            degree = Math.PI - degree;
//        }
//        /*if (x > 500 - 30) {
//            degree = Math.PI - degree;
//        }*/
//    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    /**
     * 加载窗口
     */
    public void launchFrame() {
        setSize(500, 500);
        setLocation(100, 100);
        setVisible(true);

        new PaintThread().start();  //启动重画线程
        addWindowListener(new WindowAdapter() {//ctrl+o，调出该类的所有方法并选择性重写
            @Override
            /**
             * 使窗口叉号可用
             * */
            public void windowClosing(WindowEvent e) {  //关闭窗口按钮
                System.exit(0);
            }
        });
    }

    /**
     * 定义一个重画窗口的线程类，是一个内部类
     * 达到动态图片的效果
     */
    class PaintThread extends Thread {
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(45);   //1s = 1000ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        GameFrame03 gf = new GameFrame03();
        gf.launchFrame();
    }
}
