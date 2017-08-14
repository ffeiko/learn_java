package com.ffeiko.Base64;


import org.junit.Test;

/**
 * Created by Administrator on 2017/8/12.
 * 使用jdk自带的Base64编码 JDK8自带
 */
public class Base64Demo01 {
    @Test
    public  void test01(){
        String str = "Base64编码与解码测试";
        System.err.println("原文:\n\t" + str);
        byte[] input = str.getBytes();

//        // Base64编码
//        Base64.Encoder encoder = Base64.getEncoder();
//        String data = encoder.encodeToString(input);
//        System.err.println("编码后:\n\t" + data);
//
//        // Base64解码
//        Base64.Decoder decoder = Base64.getDecoder();
//        byte[] output = decoder.decode(data);
//        System.err.println("解码后:\n\t" + new String(output));
//
//        // UrlBase64编码
//        Base64.Encoder urlEncoder = Base64.getUrlEncoder();
//        String urlData = urlEncoder.encodeToString(input);
//        System.err.println("url编码后:\n\t" + urlData);
//
//        // UrlBase64解码
//        Base64.Decoder urlDecoder = Base64.getUrlDecoder();
//        byte[] urlOutput = urlDecoder.decode(urlData);
//        System.err.println("url解码后:\n\t" + new String(urlOutput));
    }

}
