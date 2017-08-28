package com.ffeiko.performance.chapter01;

/**
 * Created by lenovo on 2017/7/9.
 */
public class TestJVMStack1 {
    private int count = 0;
    //没有出口的递归调用


    public void recursion(long a, long b, long c) throws InterruptedException {
        long d = 0, e = 0, f = 0;
        count++;
        recursion(a, b, c);
    }

    public  void testStack (){
        try {
            recursion(1L,2L,3L);
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
