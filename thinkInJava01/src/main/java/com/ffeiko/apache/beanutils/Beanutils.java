package com.ffeiko.apache.beanutils;

import com.ffeiko.apache.model.User;
import com.ffeiko.test.Person;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/31.
 */
@SuppressWarnings("all")
public class Beanutils {


    public static void main(String[] args) {
        test1();
    }

    public static  void test1(){
        User user1 = new User("wangjingfei","123");
        User user2 = new User();
        try {
            BeanUtils.copyProperties(user2,user1);
            System.out.println(user2.getPassword());
            System.out.println(user2.getUserName());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void  test02(){
        Person person = new Person();
        person.setPassword("1");
        person.setName("1223");
        try {
            Map<String, String> map = BeanUtils.describe(person);
            System.out.println(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  test03(){
        Person person = new Person();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","wangjingfei");
        map.put("password","123456");
        try {
            BeanUtils.populate(person,map);
            System.out.println(person);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }



}
