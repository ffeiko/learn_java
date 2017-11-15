package com.ffeiko.decode.hutool;

import com.xiaoleilu.hutool.date.DateTime;
import com.xiaoleilu.hutool.date.DateUnit;
import com.xiaoleilu.hutool.date.DateUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Administrator on 2017/11/5.
 */
public class DateTest {


    @Test
    public void Test01(){
        boolean pm = DateUtil.isPM(new Date());
        Assert.assertEquals(true,pm);
    }

    @Test
    public void Test02(){
        DateTime dateTime = DateUtil.beginOfDay(new Date());
        System.out.println(dateTime);
        DateTime dateTime1 = DateUtil.endOfDay(new Date());
        System.out.println(dateTime1);
    }
    @Test
    public void Test03(){
        int i = DateUtil.dayOfWeek(new Date());
        System.out.println(i);
        int i1 = DateUtil.thisDayOfWeek();
        System.out.println(i1);
    }
    @Test
    public void Test04(){
        DateTime dateTime = DateUtil.nextWeek();
        System.out.println(dateTime);
    }
    @Test
    public void Test05(){
        long l = DateUtil.betweenMonth(new Date(), new Date(), true);
        System.out.println(l);
    }
    @Test
    public void Test06(){
        //DateUnit.valueOf("");
        int month = DateUtil.month(new Date());
        System.out.println(month);
        int season = DateUtil.season(new Date());
        System.out.println(season);
    }
    @Test
    public void Test07(){

    }
    @Test
    public void Test08(){

    }
    @Test
    public void Test09(){

    }
}
