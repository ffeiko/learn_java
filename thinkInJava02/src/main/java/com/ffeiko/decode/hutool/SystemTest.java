package com.ffeiko.decode.hutool;

import com.xiaoleilu.hutool.date.DateTime;
import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.system.JavaInfo;
import com.xiaoleilu.hutool.system.JvmInfo;
import com.xiaoleilu.hutool.system.SystemUtil;
import com.xiaoleilu.hutool.system.UserInfo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Administrator on 2017/11/7.
 */
public class SystemTest {


    @Test
    public void Test01(){
        JavaInfo javaInfo = SystemUtil.getJavaInfo();
        System.out.println(javaInfo);
        long currentPID = SystemUtil.getCurrentPID();
        System.out.println(currentPID);
        JvmInfo jvmInfo = SystemUtil.getJvmInfo();
        System.out.println(jvmInfo);
        UserInfo userInfo = SystemUtil.getUserInfo();
        System.out.println(userInfo);

    }

    @Test
    public void Test02(){

    }
    @Test
    public void Test03(){

    }
    @Test
    public void Test04(){

    }
    @Test
    public void Test05(){

    }
    @Test
    public void Test06(){

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
