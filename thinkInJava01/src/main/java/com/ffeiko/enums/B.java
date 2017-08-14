package com.ffeiko.enums;

/**
 * Created by Administrator on 2017/7/6.
 */
public class B {
    public static void main(String[] args) {
        //输出某一枚举的值
        System.out.println( Color.RED.getName() );
        System.out.println( Color.RED.getIndex() );

        //遍历所有的枚举
        for( Color color : Color.values()){
            System.out.println( color + "  name: " + color.getName() + "  index: " + color.getIndex() );
        }
    }

}
