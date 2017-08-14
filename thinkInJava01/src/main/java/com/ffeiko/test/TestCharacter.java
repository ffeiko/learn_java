package com.ffeiko.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;


/**
 * Created by Administrator on 2017/8/11.
 */
public class TestCharacter
{


    @Test
    public void  test1(){
        Integer page = -1;

        page = page < 0 || page > 100?page:1;
        System.out.println(page);
    }


    @Test
    public  void test02(){
        List list =  Arrays.asList(1,2);
        System.out.println(list.contains(1));
        String s = "0326efcc176443129cedf365ba729337";
        System.out.println(s.length());
    }


    @Test
    public void  test03(){
    }

}
