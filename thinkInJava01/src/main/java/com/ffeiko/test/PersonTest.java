package com.ffeiko.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Administrator on 2017/7/11.
 */
public class PersonTest {

    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<Person>();
        List<Person> list2 = new ArrayList<Person>();


        Person person11 = new Person();
        Person person12 = new Person();
        Person person13 = new Person();
        Person person14 = new Person();
        Person person15 = new Person();
        Person person16 = new Person();

        list1.add(person11);
        list1.add(person12);
        list1.add(person13);
        list1.add(person14);

        list2.add(person11);
        list2.add(person12);
        list2.add(person13);
        list2.add(person15);
        list2.add(person16);

        //如果对象相同,留下的就是交集
//        boolean b = list2.retainAll(list1);
//        if (b) {
//            System.out.println(list2.size());
//        }

        /*****************************************************************************/
        //从List2当中移除掉list1的模块
//        boolean b = list2.removeAll(list1);
//        if (b){
//            System.out.println(list2);
//        }

        //如果是两个不同的对象,Id相同如何判断是否相等
        /*****************************************************************************/
        person14.setName("wangjingfei");
        person15.setName("wangjingfei");


        //因为Object.equals null , null 返回true ,所以相等
        System.out.println(person16.equals(person11));
        System.out.println(Objects.equals(null,null));
        //重置之后就可以了,也就是说移除是有作用的
        person16.setName("王进飞");
        boolean b = list2.removeAll(list1);

        if (b){
            System.out.println(list2.size());
        }

        /*******************************************************************************/

    }
}
