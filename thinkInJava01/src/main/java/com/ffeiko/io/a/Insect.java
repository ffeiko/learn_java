package com.ffeiko.io.a;

/**
 * Created by Administrator on 2017/6/30.
 */
public class Insect {
    private int size;
    private String color;

    public Insect() {
    }

    public Insect(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Move");
    }

    public void attack() {
        move();  //假设昆虫在攻击前必须要先移动一次
        System.out.println("Attack");
    }

}
