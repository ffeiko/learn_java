package com.ffeiko.io.a;

/**
 * Created by Administrator on 2017/6/30.
 */
public class Bee extends Insect {

    public Bee(int size, String color) {
        super(size, color);
    }

    public void move() {
        System.out.println("Fly");
    }

    public void attack() {
        move();
        super.attack();
    }


}
