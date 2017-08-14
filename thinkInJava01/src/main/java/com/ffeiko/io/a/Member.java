package com.ffeiko.io.a;

/**
 * Created by Administrator on 2017/7/5.
 */
public class Member {
    private String name;
    private int age;

    public Member(String wangjignfei, int i) {
        this.age=i;
        this.name = wangjignfei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
