package com.ffeiko.reflect.B;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/16.
 */
@SuppressWarnings("Duplicates")
public class ReflectTest {

    @Test
    public void test01() {
        //1. 获取 Class 类实例
        TestClass testClass = new TestClass();
        Class mClass = testClass.getClass();
        //2. 获取私有方法
        //第一个参数为要获取的私有方法的名称
        //第二个为要获取方法的参数的类型，参数为 Class...，没有参数就是null
        //方法参数也可这么写 ：new Class[]{String.class , int.class}
        Method privateMethod = null;
        try {
            privateMethod = mClass.getDeclaredMethod("privateMethod", String.class, int.class);
            //3. 开始操作方法
            if (privateMethod != null) {
                //获取私有方法的访问权
                //只是获取访问权，并不是修改实际权限
                privateMethod.setAccessible(true);
                //使用 invoke 反射调用私有方法
                //privateMethod 是获取到的私有方法
                //testClass 要操作的对象
                //后面两个参数传实参
                privateMethod.invoke(testClass, "Java Reflect ", 666);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void  test02(){
        try {
            //1. 获取 Class 类实例
            TestClass testClass = new TestClass();
            Class mClass = testClass.getClass();

            //2. 获取私有变量
            Field privateField = mClass.getDeclaredField("MSG");

            //3. 操作私有变量
            if (privateField != null) {
                //获取私有变量的访问权
                privateField.setAccessible(true);

                //修改私有变量，并输出以测试
                System.out.println("Before Modify：MSG = " + testClass.getMsg());

                //调用 set(object , value) 修改变量的值
                //privateField 是获取到的私有变量
                //testClass 要操作的对象
                //"Modified" 为要修改成的值
                privateField.set(testClass, "Modified");
                System.out.println("After Modify：MSG = " + testClass.getMsg());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test03(){
       try {
           //1. 获取 Class 类实例
           TestClass testClass = new TestClass();
           Class mClass = testClass.getClass();

           //2. 获取私有常量
           Field finalField = mClass.getDeclaredField("FINAL_VALUE");

           //3. 修改常量的值
           if (finalField != null) {

               //获取私有常量的访问权
               finalField.setAccessible(true);

               //调用 finalField 的 getter 方法
               //输出 FINAL_VALUE 修改前的值
               System.out.println("Before Modify：FINAL_VALUE = " + finalField.get(testClass));

               //修改私有常量
               finalField.set(testClass, "Modified");

               //调用 finalField 的 getter 方法
               //输出 FINAL_VALUE 修改后的值
               System.out.println("After Modify：FINAL_VALUE = "
                       + finalField.get(testClass));

               //使用对象调用类的 getter 方法
               //获取值并输出
               System.out.println("Actually ：FINAL_VALUE = " + testClass.getClass());

           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }




}
