package com.ffeiko.apache.MapUtils;

import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.MapUtils;
import org.junit.Test;

import java.util.*;

/**
 * Created by Administrator on 2017/7/31.
 */
@SuppressWarnings("all")
public class MpaDemo01 {


    @Test
    public void test1() {
        List list = Arrays.asList(1, 2, 3, 4, 56, 7);
        Map map = new HashMap();

    }

    /**
     * 遍历Map
     */
    @Test
    public void test02() {
        Map map = new HashMap();
        map.put("name", "1");
        map.put("password","2");
        Set<Map.Entry<String, String>> entryseSet=map.entrySet();
        for (Map.Entry<String, String> entry:entryseSet) {
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        for (Map.Entry<String, String> entry1:(Set<Map.Entry<String, String>>)map.entrySet()) {
            System.out.println(entry1.getKey() + "," + entry1.getValue());
        }
    }
    @Test
    public void  test03(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        // JDK1.4中
        // 遍历方法一 hashMap.entrySet() 遍历
        System.out.println("方法一");
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry =  it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + "; value = " + value);
        }
    }
}
