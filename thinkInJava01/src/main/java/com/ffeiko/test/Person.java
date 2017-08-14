package com.ffeiko.test;

import java.util.Objects;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Person {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //重写equals方法
    @Override
    public boolean equals(Object obj) {

        // 如果为同一对象的不同引用,则相同
        if (this == obj) {
            return true;
        }
        // 如果传入的对象为空,则返回false
        if (obj == null) {
            return false;
        }
        // 如果两者属于不同的类型,不能相等
        if (getClass() != obj.getClass()) {
            return false;
        }
        // 类型相同, 比较内容是否相同
        Person other = (Person) obj;
        return Objects.equals(name, other.name);

    }
}

