package filter;

import javax.servlet.*;
import java.io.IOException;

public class Filter1 implements Filter {
    public void init(FilterConfig config) throws ServletException {
        // 获取初始化参数
        String site = config.getInitParameter("Site");

        // 输出初始化参数
        System.out.println("-------------- filter init ------------");
        System.out.println("name: " + site);
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException {

        // 输出站点名称
        System.out.println("url: http://www.runoob.com");

        // 把请求传回过滤链
        chain.doFilter(request, response);
    }

    public void destroy() {
        /* 在 Filter 实例被 Web 容器从服务移除之前调用 */
        System.out.println("-------------- filter destroy -----------");
    }

}
