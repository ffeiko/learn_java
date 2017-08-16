package com.ffeiko.reflect.B;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/16.
 */
public class ReflectTest {

    @Test
    public void  test01(){
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
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        //3. 开始操作方法
        if (privateMethod != null) {
            //获取私有方法的访问权
            //只是获取访问权，并不是修改实际权限
            privateMethod.setAccessible(true);

            //使用 invoke 反射调用私有方法
            //privateMethod 是获取到的私有方法
            //testClass 要操作的对象
            //后面两个参数传实参
            try {
                privateMethod.invoke(testClass, "Java Reflect ", 666);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
