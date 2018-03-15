package chap_10;

import java.util.concurrent.TimeUnit;

/**
 * @author wangjingffei
 * @DESCRIPTION
 * @create 2018/3/14
 */
public class StopThread {
    //
    private static  boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (!stopRequested) {
                    System.out.println("=========="+i);
                    i++;
                }
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
