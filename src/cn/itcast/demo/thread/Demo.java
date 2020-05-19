package cn.itcast.demo.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author : huajuan
 * create at : 2019-05-25 00:14
 * description :
 * remark :
 * @program: basics
 **/
public class Demo{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("这里是" + Thread.currentThread().getName() + "线程");
        //创建 线程任务对象
        MyRunnable mr = new MyRunnable();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        //创建线程对象 绑定线程任务
        Thread t1 = new Thread(mr,"小强");
        t1.start();

        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName() + "来福 " + i);
        }
        // 计数器-1
        countDownLatch.countDown();
        // 主线程阻塞
        countDownLatch.await();
    }
}
