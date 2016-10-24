package polymophism.servlet;

/**
 * 分析Servlet中的serve()和doGet()方法
 * Created by hzq on 16-10-13.
 */
public class Test {
    public static void main(String[] args) {
        HttpServlet s = new MyServlet();
        s.serve();
    }
}
