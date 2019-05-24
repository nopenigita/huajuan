package cn.itcast.demo.thread;

/**
 * @author : huajuan
 * create at : 2019-05-25 00:23
 * description :
 * remark :
 * @program: basics
 **/
public class NoNameInnerClass {

    public static void main(String[] args) {

        /**
         * 使用匿名内部类来完成线程的开启
         */
        new Runnable() {
            @Override
            public void run() {
                System.out.println("这是一个新的线程目标");
            }
        };

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        }).start();
    }
}
