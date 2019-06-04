package cn.itcast.demo.thread.threadPool;

/**
 * @author : huajuan
 * create at : 2019-05-26 23:33
 * description :
 * remark :
 * @program: basics
 **/
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("我需要一个教练");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了" + Thread.currentThread().getName());
        System.out.println("教好了,教练返回线程池");
    }
}
