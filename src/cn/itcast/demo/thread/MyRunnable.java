package cn.itcast.demo.thread;

/**
 * @author : huajuan
 * create at : 2019-05-25 00:15
 * description : 线程任务类
 * remark :
 * @program: basics
 **/
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            //获取当前线程的名称
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
