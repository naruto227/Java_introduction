package polymophism.servlet;

/**
 * Created by hzq on 16-10-13.
 */
public class HttpServlet {
    public void serve(){
        System.out.println("HttpServlet.serve()");
        this.doGet();//调用子类方法，查找顺序为：子类——>父类——>Object
    }

    public void doGet(){
        System.out.println("HttpServlet.doGet()");
    }

    public void doPost(){

    }
}
