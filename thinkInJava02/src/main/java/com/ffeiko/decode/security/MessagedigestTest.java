package com.ffeiko.decode.security;

import org.junit.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by lenovo on 2017/8/16.
 */
public class MessagedigestTest {

    @Test
    public void test01() {
        try {
            byte[] input = "wangjingfei".getBytes();

            MessageDigest sha =   MessageDigest.getInstance("wangjingfei");
            sha.update(input);
            byte[] bytes = sha.digest();
            System.out.println(bytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }
}
