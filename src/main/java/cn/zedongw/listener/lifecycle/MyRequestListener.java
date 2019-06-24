package cn.zedongw.listener.lifecycle;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @Author ZeDongW
 * @ClassName MyRequestListener
 * @Description request生命周期监听器
 * @Version 1.0
 * @date ：Created in 2019/6/22 0022 15:31
 * @modified By：
 */

public class MyRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("MyRequestListener.requestDestroyed()");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("MyRequestListener.requestInitialized()");
    }
}
