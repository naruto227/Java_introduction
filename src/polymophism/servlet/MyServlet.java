package polymophism.servlet;

/**
 * Created by hzq on 16-10-13.
 */
public class MyServlet extends HttpServlet {
    @Override
    public void doGet() {
//        super.doGet();
        System.out.println("MyServlet.doGet()");
    }

}
