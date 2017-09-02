package com.ffeiko.enums;

import sun.applet.Main;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/2.
 */
public class Test5 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1",SourceTagEnum.OWNER_CREATE);
        System.out.println(SourceTagEnum.OWNER_CREATE);
    }
}
