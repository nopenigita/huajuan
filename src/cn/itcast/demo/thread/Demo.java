package cn.itcast.demo.thread;

/**
 * @author : huajuan
 * create at : 2019-05-25 00:14
 * description :
 * remark :
 * @program: basics
 **/
public class Demo{
    public static void main(String[] args) {
        System.out.println("这里是" + Thread.currentThread().getName() + "线程");

        //创建 线程任务对象
        MyRunnable mr = new MyRunnable();

        //创建线程对象 绑定线程任务
        Thread t1 = new Thread(mr,"小强");
        t1.start();

        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName() + "来福 " + i);
        }
    }
}
