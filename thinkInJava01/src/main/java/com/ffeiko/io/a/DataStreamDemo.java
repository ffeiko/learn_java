package com.ffeiko.io.a;

import java.io.*;

/**
 * Created by Administrator on 2017/7/5.
 */
public class DataStreamDemo {
    public static void main(String[] args) {
        Member[] members = {new Member("wangjignfei", 90), new Member("wangjignfei", 90), new Member("wangjignfei", 90)};

        try {
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(args[1]));
            for (Member member : members) {
                //写入utf字符串
                outputStream.writeUTF(member.getName());
                //写入int数据
                outputStream.writeInt(member.getAge());
            }
            //所有数据至目的地
            outputStream.flush();
            //关闭流
            outputStream.close();
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(args[1]));

            //读出数据并还原为对象
            for (int i = 0; i < members.length; i++) {
                //读出UTF字符串
                String name = dataInputStream.readUTF();
                //读出int数据
                int score = dataInputStream.readInt();
                members[i] = new Member(name, score);
            }

            //关闭流
            dataInputStream.close();

            //显示还原后的数据
            for (Member member : members) {
                System.out.printf("%s\t%d%n", member.getName(), member.getAge());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
