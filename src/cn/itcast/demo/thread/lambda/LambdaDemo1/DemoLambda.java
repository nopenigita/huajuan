package cn.itcast.demo.thread.lambda.LambdaDemo1;

/**
 * @author : huajuan
 * create at : 2019-05-27 23:32
 * description :
 * remark :
 * @program: basics
 **/
public class DemoLambda {
    public static void main(String[] args) {
        //完成一个新的线程创建
        //new Thread(new MyRunnable()).start();

        //匿名内部类方式 创建线程
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程");
//            }
//        };
//        new Thread(r).start();

        new Thread(()-> System.out.println("开启一个新的线程")).start();


    }
}
