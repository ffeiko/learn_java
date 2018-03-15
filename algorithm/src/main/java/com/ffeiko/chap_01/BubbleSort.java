package com.ffeiko.chap_01;

/**
 * @author wangjingffei
 * @DESCRIPTION
 * @create 2018/3/15
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] name = {2,1,3,5,2,6,8};
        for (int i = 0; i < name.length-1; i++) {
            for (int  j = i+1; j < name.length; j++) {
                if (name[i] <name[j]){
                    int temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        for (int i : name) {
            System.out.print(i);
        }
    }
}
