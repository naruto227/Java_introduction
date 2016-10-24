package MyGame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏窗口类
 * Created by hzq on 16-10-24.
 */
public class GameFrame extends Frame {  //GUI编程：AWT,swing等

    Image img = GameUtil.getImage("images/lADOff4-9ygo_40_40.jpg_620x10000q90g.jpg");//图片路径src下

    private double x, y;

    @Override
    public void paint(Graphics g) {
//        System.out.println("paint!!!");
        g.drawLine(100, 100, 200, 200);
        g.drawRect(100, 100, 200, 200);
        g.drawOval(100, 100, 200, 200);
//        设置字体大小
        Font font = new Font("宋体", Font.BOLD, 30);
        g.setFont(font);

        g.drawString("我是hehe", 200, 200);
        g.setColor(Color.red);//修改画笔颜色

        g.fillRect(100, 100, 20, 20);

        g.drawImage(img, (int) x, (int) y, null);   //在窗口上重画图片
        x += 3;
        y += 3;
    }

    /**
     * 加载窗口
     */
    public void launchFrame() {
        setSize(1000, 1000);
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
                    Thread.sleep(50);   //1s = 1000ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        GameFrame gf = new GameFrame();
        gf.launchFrame();
    }
}
