package com.ffeiko.performance.chapter01;

/**
 * Created by lenovo on 2017/7/9.
 */
public class TestJVMStack {
    private int count = 0;

    public void recursion() {
        count++;
        recursion();//递归
    }

    public  void testStack (){
        try {
            recursion();

        }catch (Throwable e){
            System.out.println("deep of stack is" + count);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestJVMStack ts = new TestJVMStack();
        ts.testStack();
    }


}
