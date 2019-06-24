package cn.zedongw.listener.binding;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @Author ZeDongW
 * @ClassName Students
 * @Description 实现seesiion绑定接口的实体类
 * @Version 1.0
 * @date ：Created in 2019/6/24 0024 15:02
 * @modified By：
 */

public class Students implements HttpSessionBindingListener {

    private int id;  //编号
    private String name; //姓名
    private int age; //年龄

    public Students() {
    }

    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("Students对象已绑定");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("Students对象已解绑");
    }
}
