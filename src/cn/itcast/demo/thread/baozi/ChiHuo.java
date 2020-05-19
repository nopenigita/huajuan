package cn.itcast.demo.thread.baozi;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : huajuan
 * create at : 2019-05-26 22:53
 * description :
 * remark :
 * @program: basics
 **/
public class ChiHuo extends Thread {

    private BaoZi bz;

    ReentrantLock lock = new ReentrantLock();

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        //吃包子
        while (true) {
            synchronized (bz) {
                //代表没有包子
                if (!bz.flag) {
                    try {
                        System.out.println("没有包子,吃货等待");
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //吃包子
                System.out.println("吃货被唤醒");

                System.out.println("吃货正在吃" + bz.xianer + ",再吃" + bz.pier);
                //吃完了 改变包子的状态
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
