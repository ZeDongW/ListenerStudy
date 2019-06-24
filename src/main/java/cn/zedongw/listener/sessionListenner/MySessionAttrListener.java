package cn.zedongw.listener.sessionListenner;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @Author ZeDongW
 * @ClassName MySessionAttrListener
 * @Description Session属性监听器
 * @Version 1.0
 * @date ：Created in 2019/6/22 0022 16:19
 * @modified By：
 */

public class MySessionAttrListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("添加的属性：" + httpSessionBindingEvent.getSession().getAttribute("userName"));
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("移除的属性");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("原来的属性：" + httpSessionBindingEvent.getValue());
        System.out.println("新的属性：" + httpSessionBindingEvent.getSession().getAttribute("userName"));
    }
}
