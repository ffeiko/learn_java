package com.ffeiko.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/18.
 */
@SuppressWarnings("all")
public class Test02 {


    public static void fillNumberList(List<? super Number> list) {
        list.add(new Integer(0));
        list.add(new Float(1.0));
    }
    public static void main(String[] args) {
        List<? super Number> list=new ArrayList();
        list.add(new Integer(1));
        list.add(new Float(1.1));
    }

//    List<? super Number>可以代表List<T>，其中T为Number父类，（虽然Number没有父类）。如果说，T为Number的父类，我们想List<T>中加入Number的子类肯定是可以的。
//    非法使用
//    对List<? superT>进行迭代是不允许的。为什么呢？你知道用哪种接口去迭代List吗？因为父类有很多,有的父类可能没有相应的方法
//    只有用Object类的接口才能保证集合中的元素都拥有该接口，显然这个意义不大。其应用场景略。
//    无界通配符
//    知道了通配符的上界和下界，其实也等同于知道了无界通配符，不加任何修饰即可，单独一个“？”。如List<?>，“？”可以代表任意类型，“任意”也就是未知类型。
//    List<Object>与List<?>并不等同，List<Object>是List<?>的子类。还有不能往List<?> list里添加任意对象，除了null。
}
