package com.ffeiko.decode.math;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.abs;
import static java.lang.Math.ceil;

/**
 * Created by wangjingffei on 2017/11/15.
 */
public class MathTest {

    @Test
    public  void test01(){
//        需要注意的问题,类型自动提升,其实类型提升是在运算之前完成的
//        加法运算
//        byte a = 1;
//        byte b = 2;
//        byte c = a+b;
//        报错,因为a+b之前会将a,b自动提升为int
//        byte c = (byte)(a+b);
//       减法运算
//                加法运算是一样的
//        乘法运算
//                同样遵循类型自动提升
//            int a = 3*5;  //  结果为: 15 int类型
//        double b = 3*5.0; //  结果为: 15.0 double类型
               // 除法运算
   //     两个整数相除结果为整数,小数位截断
//        int a = 10/4;  // 结果为2
//        int b 5/7;   //结果为0
//        //         如果参与运算有浮点数,则进行浮点数除
//        double a = 10.0/5.0;     // 结果为2.0
//        double b = 10.0/5;        //结果为2.0
         double c = 10.0/0;        //结果为Infinity(正无穷大)
//        Assert.assertNotNull("是不是为空了",null);
//        Assert.assertEquals(Infinity,c);
//        double d = -10.0/0;       //结果为-Infinity(负无穷大)
         double e = 0.0/0;         //结果为NaN(不是数字)
//        System.out.println("========" + NaN);
        //      求余运算分3步
        //    第一步: 左边操作数的绝对值减去右边操作数的绝对值,得到差
        //    第二步: 得到的差两种情况
        //          如果差比右边操作数的绝对值大,再执行第一步
        //   如果差比右边操作数的绝对值小,将差返回
        //    第三步: 结果的符号为左边操作数的符号
        //    需要注意的是: 整数进行求余时,右边操作数为0,则报错,浮点数进行求余时,右边操作数为0,则为NaN
//        15%4 = 3;
//        -15%4 = -3;
        //   15%0 报错
        //   15.0%0 = NaN
        //   自增自减运算
//        int b = a++;  // 先把a的值赋给b,a再+1
//        int b = ++a;  // 先给a+1,再把a的值赋给b
        // 关系运算符
//                ==,!=,>,>=,<,<=
        //  逻辑运算符
//        短路与: 使用&&表示,双目运算符,只要第一个操作数为false,就发生短路,后面不执行
//        短路或: 使用||表示,双目运算符,只要第一个操作数为true,就发生短路,后面不执行
//        非短路与: 使用&表示,双目运算符,如果第一个操作数为false,第二个操作数还会执行
//        非短路或: 使用|表示,双目运算符,如果第一个操作数为true,第二个操作数还会执行
//        String str = null;
//        if(str != null & !str.equals("")){}  // 报错,空指针异常,因为第二个操作数也执行了
//        if(str != null & !str.equals("")){}  // 不报错,因为第二个操作数没有执行
//        非运算
//                三目运算符
//        5>10?true:false;
//        位运算
//                位运算cpu直接支持的,效率最高
//        位运算允许对整数中单个比特进行操作,为运算会对两个操作数中对应比特执行布尔代数运算,产生结果
//                & 与: 二者比特都是1,则结果为1,否则为0
//                | 或: 二者比特都是0,则结果为0,否则为1
//                ^ 异或: 二者比特相同,则结果为0,否则为1
//        ~ 非: 讲被操作数按位取反
//        int a = 12|2; // 1100|0010 打印结果14
//        1100
//                |   0010
//                --------
//        1110
//                << 左移
//        int a = 8<<1; //打印16
//        int为32bit
//        8的二进制位:                 0000 0000 0000 0000 0000 0000 0000 1000
//        左移动1bit,在右边填充0: 0000 0000 0000 0000 0000 0000 0001 0000
//                >> 右移
//        int a = 8>>1; //打印4
//        int为32bit
//        8的二进制位:                 0000 0000 0000 0000 0000 0000 0000 1000
//        右移动1bit,在右边填充0: 0000 0000 0000 0000 0000 0000 0000 0100
    }

    @Test
    public  void test02(){
          abs(-1);
          Assert.assertEquals(1,abs(-1));
//        返回绝对值
//        ceil()

//            Assert.assertEquals(ceil(7.9),8.0);
//          Assert.assertEquals(8.0,ceil(7.5));
//          Assert.assertEquals(8.0,ceil(7.7));
//        返回一个大于等于操作数的最近整数值
//        Math.ceil(8.7); //9.0
//        Math.ceil(9.0); //9.0
//        Math.ceil(9.0); //9.0
//        floor()
//        返回一个不大于操作数的最近整数值
//        Math.floor(8.7); //8.0
//        Math.floor(9.0); //8.0
//        Math.floor(9.0); //9.0
//        max()
//        返回两个操作数的最大一个
//        Math.max(1,2);
//        min()
//        返回两个操作数的最小一个
//        Math.min(1,2);
//        random()
//        返回大于等于0.0小于1.0的随机double型
//        round()
//        返回最接近操作数的整数(四舍五入)
//        toRadians()
//        转换为弧度
//        Math.toRadians(90.0); //1.57079...
//        sin()
//        返回给定角度的正弦,操作数是double型
//        Math.sin(Math.toRadians(90.0)); //求90度角的正弦值,返回1.0
//        cos()
//        返回给定角度的余弦,操作数是double型
//        Math.cos(Math.toRadians(0.0)); //求0度角的余弦值,返回1.0
//        tan()
//        返回给定角度的正切,操作数是double型
//        Math.tan(Math.toRadians(45.0)); //求45度角的正切值,返回1.0
//        sqrt()
//        返回给定值的平方根,,操作数是double型
//        Math.sqrt(4.0); //2.0
//        Math.sqrt(-4.0); //Nan
//        toDegrees()
//        返回给定弧度的角度值
//        Math.toDegrees(Math.PI*0.5); //90.0
    }
    @Test
    public  void test03(){

    }

    @Test
    public  void test04(){

    }




}
