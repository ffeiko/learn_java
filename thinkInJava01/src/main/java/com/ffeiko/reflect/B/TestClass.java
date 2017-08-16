package com.ffeiko.reflect.B;

/**
 * Created by Administrator on 2017/8/16.
 */
public class TestClass {


    private String MSG = "Original";

    private void privateMethod(String head , int tail){
        System.out.print(head + tail);
    }

    public String getMsg(){
        return MSG;
    }


}
