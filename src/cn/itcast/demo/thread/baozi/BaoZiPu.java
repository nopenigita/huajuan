package cn.itcast.demo.thread.baozi;

/**
 * @author : huajuan
 * create at : 2019-05-26 22:52
 * description : 包子铺 生产包子的线程
 * remark : 写代码的过程中资源在是Demo main方法中的局部变量bz怎么传递到当前包子铺类里
 * 1 解决方法 在构造中添加包子类型 参数
 * 2 成员位置 创建一个包子铺对象
 * @program: basics
 **/
public class BaoZiPu extends Thread {

    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                //生产包子 首先判断包子资源的状态
                if (bz.flag) {
                    //有包子不生产,无限等待
                    try {
                        System.out.println("有包子,包子铺等待");
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒后 执行的操作
                System.out.println("包子铺被唤醒后,执行生产包子动作");
                if (count % 2 == 0) {
                    bz.pier = "冰皮";
                    bz.xianer = "五仁";
                } else {
                    bz.pier = "薄皮";
                    bz.xianer = "牛肉大葱";
                }
                count++;
                System.out.println("包子铺正在生产" + bz.pier + bz.xianer);
                bz.flag = true;
                System.out.println("包子生产好了,吃货来吃吧");
                bz.notify();
            }
        }
    }
}
