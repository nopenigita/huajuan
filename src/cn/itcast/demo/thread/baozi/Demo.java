package cn.itcast.demo.thread.baozi;

/**
 * @author : huajuan
 * create at : 2019-05-26 22:48
 * description : 测试类 完成 等待唤醒机制 有效的利用资源
 * remark : 吃包子案例
 * @program: basics
 **/
public class Demo {
    public static void main(String[] args) {
        /**
         * 完成吃包子案例
         */
        //1 创建包子资源对象
        BaoZi bz = new BaoZi();

        //2 创建包子铺对象
        BaoZiPu bzp = new BaoZiPu(bz);

        //3 创建吃货对象
        ChiHuo ch = new ChiHuo(bz);

        //4 分别开启包子铺和吃货的线程
        bzp.start();
        ch.start();
    }
}
