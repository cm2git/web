package service;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @autthor Administrator
 * @since 2017/2/20
 */

public class HelloWorldServlet implements Servlet{

    private ServletConfig servletConfig;

    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        System.out.println("hello world init");
    }

    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello world");
        System.out.println("context path:"+servletConfig.getServletContext().getContextPath());
        System.out.println("request context path:"+servletRequest.getServletContext().getContextPath());
        System.out.println("servletContext object:"+getServletContext());
        Enumeration<String> en = getServletContext().getServletNames();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        getServletContext().log("test servletContext log method");
        getServletContext().log("test servletContext log method");
        System.out.println( getServletContext().getRealPath("/"));
        System.out.println( getServletContext().getResourcePaths("/"));
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("hello world servlet is  destroyed");
    }


    public ServletContext getServletContext(){
        if(servletConfig==null){
            throw new RuntimeException();
        }
        return servletConfig.getServletContext();
    }
}
