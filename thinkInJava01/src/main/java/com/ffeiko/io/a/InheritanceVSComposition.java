package com.ffeiko.io.a;

/**
 * Created by Administrator on 2017/6/30.
 */
public class InheritanceVSComposition {
    public static void main(String[] args) {
        Insect i = new Bee(1,"red");
        i.attack();
    }
}
