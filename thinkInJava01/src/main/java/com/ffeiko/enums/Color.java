package com.ffeiko.enums;

/**
 * 使用自定义函数
 * Created by Administrator on 2017/7/6.
 */
public enum Color {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);

    private String name ;
    private int index ;

    private Color( String name , int index ){
        this.name = name ;
        this.index = index ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }
    //枚举不需要提供set方法,因为值不需要改变
    public void setIndex(int index) {
        this.index = index;
    }
}
