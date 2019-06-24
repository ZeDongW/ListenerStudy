package cn.zedongw.listener.lifecycle;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Author ZeDongW
 * @ClassName MySessionListener
 * @Description Session监听器
 * @Version 1.0
 * @date ：Created in 2019/6/22 0022 15:48
 * @modified By：
 */

public class MySessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("MySessionListener.sessionCreated()");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("MySessionListener.sessionDestroyed()");
    }
}
