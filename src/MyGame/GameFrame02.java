package MyGame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 测试窗口物体沿着各种轨迹移动
 * Created by hzq on 16-10-24.
 */
public class GameFrame02 extends Frame {  //GUI编程：AWT,swing等

    Image img = GameUtil.getImage("images/lADOff4-9ygo_40_40.jpg_620x10000q90g.jpg");//图片路径src下

    private double x = 50, y = 100;
    private boolean left, up;

    @Override
    public void paint(Graphics g) {

        g.drawImage(img, (int) x, (int) y, null);   //在窗口上重画图片
        /*if (left) { //向左
            x -= 3;
        } else {
            x += 3;
        }
        if (x > 500 - 30) { //到达最右边
            left = true;
        }
        if (x < 0) {
            left = false;
        }*/

        if(up){
            y -= 8;
        }else {
            y += 8;
        }
        if(y > 500 - 30){   //到达最下面
            up = true;
        }
        if(y < 30){
            up = false;
        }
//        x += 3;
//        y += 3;
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
        GameFrame02 gf = new GameFrame02();
        gf.launchFrame();
    }
}
