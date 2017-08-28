package com.ffeiko.generics;

import com.ffeiko.Date.Date;

/**
 * Created by Administrator on 2017/8/18.
 */
public class Box<T> {


    private T name;
    private Date date;

    public Box() {
    }

    public Box(T name, Date date) {
        this.name = name;
        this.date = new Date();
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Box{" + "name=" + name + ", date=" + date + '}';

    }
}
