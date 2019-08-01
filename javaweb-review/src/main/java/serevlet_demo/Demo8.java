package serevlet_demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Demo8")
// 扩展 HttpServlet 类
public class Demo8 extends HttpServlet {

    // 处理 GET 方法请求的方法
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        // 设置错误代码和原因
        response.sendError(407, "Need authentication!!!" );
    }
    // 处理 POST 方法请求的方法
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
