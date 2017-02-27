package service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @autthor Administrator
 * @since 2017/2/20
 */

public class HelloWorldHttpServlet extends HttpServlet{

    @Override
    public void init() throws ServletException {
        System.out.println("http servlet init");
        System.out.println("http servlet init");
        System.out.println("http servlet init");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello world");
        System.out.println("servletContext object:"+getServletContext());

        System.out.println(getServletContext().getContext("/aaa/bbb"));
    }
}
