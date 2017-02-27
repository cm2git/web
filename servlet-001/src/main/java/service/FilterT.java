package service;

import javax.servlet.*;
import java.io.IOException;

/**
 * @autthor Administrator
 * @since 2017/2/23
 */

public class FilterT implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filterT init");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("before filterT doFilter ");
        chain.doFilter(request,response);
        System.out.println("after filterT doFilter ");
    }

    public void destroy() {

    }
}
