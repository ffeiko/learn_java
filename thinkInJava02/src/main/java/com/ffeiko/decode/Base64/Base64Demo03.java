package com.ffeiko.decode.Base64;

/**
 * Created by Administrator on 2017/8/18.
 */
public class Base64Demo03
{
    static String str = "好好学习，天天向上";
    public static void main(String[] args) {
        ccDemo();
        bcDemo();
    }
    //commons codec
    public static void ccDemo() {
        //加密
        byte[] encodeBytes = org.apache.commons.codec.binary.Base64.encodeBase64(str.getBytes());
        System.out.println(new String(encodeBytes));
        //解密
        byte[] decodeBytes = org.apache.commons.codec.binary.Base64.decodeBase64(encodeBytes);
        System.out.println(new String(decodeBytes));
    }
    //bouncy castle
    public static void bcDemo() {
        //加密
        byte[] encodeBytes = org.bouncycastle.util.encoders.Base64.encode(str.getBytes());
        System.out.println(new String(encodeBytes));
        //解密
        byte[] decodeBytes = org.bouncycastle.util.encoders.Base64.decode(encodeBytes);
        System.out.println(new String(decodeBytes));
    }
}
