package cn.zedongw.listener.lifecycle;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author ZeDongW
 * @ClassName MyServletContextListener
 * @Description ServletContext声明周期监听器
 * @Version 1.0
 * @date ：Created in 2019/6/22 0022 15:46
 * @modified By：
 */

public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("MyServletContextListener.contextInitialized()");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("MyServletContextListener.contextDestroyed()");
    }
}
