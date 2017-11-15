package com.ffeiko.decode.inputStream;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/11/7.
 */
public class DstService {


    public static void main(String[] args) {
        try {
            // 启动监听端口 8001
            ServerSocket ss = new ServerSocket(8001);
            boolean bRunning = true;
            while (bRunning) {
                // 接收请求
                Socket s = ss.accept();
                // 将请求指定一个线程去执行
                new Thread(new DstServiceImpl(s)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
