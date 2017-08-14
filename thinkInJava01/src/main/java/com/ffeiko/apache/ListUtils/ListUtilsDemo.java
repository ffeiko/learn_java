package com.ffeiko.apache.ListUtils;

import org.apache.commons.collections.ListUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public class ListUtilsDemo {

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> integers1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        boolean equalList = ListUtils.isEqualList(integers, integers1);
        System.out.println(equalList);
    }


    @Test
    public  void test2(){

    }
}
