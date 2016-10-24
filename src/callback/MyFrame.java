package callback;

import com.sun.prism.Graphics;

/**
 * Created by hzq on 16-10-14.
 */
public abstract class MyFrame {
    public abstract void paint(/*Graphics g*/);
}

interface IMyFrame{
    void paint();
}