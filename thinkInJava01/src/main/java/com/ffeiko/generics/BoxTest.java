package com.ffeiko.generics;

import org.junit.Test;

/**
 * Created by Administrator on 2017/8/18.
 */
public class BoxTest {



    @Test
    public  void  Test01(){
        Box<String> box = new Box<String>();
        System.out.println(box);
    }
}
