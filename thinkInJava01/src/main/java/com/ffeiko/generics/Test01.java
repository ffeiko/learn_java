package com.ffeiko.generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/18.
 */
public class Test01 {
    public static void printIntValue(List<? extends Number> list) {
        for (Number number : list) {
            System.out.print(number.intValue() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(2);
        integerList.add(2);
        printIntValue(integerList);
        List<Float> floatList = new ArrayList<Float>();
        floatList.add((float) 3.3);
        floatList.add((float) 0.3);
        printIntValue(floatList);
        List<? extends Number> list1 = new ArrayList<Integer>();
    }


//    public static void fillNumberList(List<? extends Number> list) {
//        list.add(new Integer(0));//编译错误
//        list.add(new Float(1.0));//编译错误
//    }
//    public static void main(String[] args) {
//        List<? extends Number> list=new ArrayList();
//        list.add(new Integer(1));//编译错误
//        list.add(new Float(1.0));//编译错误
//    }

//    List<? extends Number>可以代表List<Integer>或List<Float>，为什么不能像其中加入Integer或者Float呢？
//    首先，我们知道List<Integer>之中只能加入Integer。并且如下代码是可行的：
//            [java] view plain copy
//    List<? extends Number> list1=new ArrayList<Integer>();
//    List<? extends Number> list2=new ArrayList<Float>();
//    假设前面的例子没有编译错误，如果我们把list1或者list2传入方法fillNumberList，显然都会出现类型不匹配的情况，假设不成立。
//    因此，我们得出结论：不能往List<? extends T> 中添加任意对象，除了null。
//    那为什么对List<? extends T>进行迭代可以呢，因为子类必定有父类相同的接口，这正是我们所期望的。
//    首先泛型表示一种类型,放了一个类型,其他的类型就不能有了,所以就不能放入
//

    @Test
    public void test03() {
        List<Number> list = new ArrayList<Number>();
        list.add(1);
        System.out.println(list);
    }


}
