package com.ffeiko.decode.security;

import org.junit.Test;

import java.security.Provider;
import java.security.Security;
import java.util.Map;

/**
 * Created by lenovo on 2017/8/16.
 */
public class SecurityTest
{

    @Test
    public void  test01(){
        for (Provider p : Security.getProviders()) {
            System.out.println(p);
            for (Map.Entry<Object,Object> entry:p.entrySet()) {
                System.out.println("\t"+entry.getKey());
            }
        }
    }

}
