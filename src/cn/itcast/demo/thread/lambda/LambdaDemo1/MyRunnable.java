package cn.itcast.demo.thread.lambda.LambdaDemo1;

/**
 * @author : huajuan
 * create at : 2019-05-27 23:33
 * description :
 * remark :
 * @program: basics
 **/
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("新的线程启动");
    }
}
