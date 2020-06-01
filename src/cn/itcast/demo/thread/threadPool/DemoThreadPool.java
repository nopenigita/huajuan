package cn.itcast.demo.thread.threadPool;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * @author : huajuan
 * create at : 2019-05-26 23:32
 * description :
 * remark :
 * @program: basics
 **/
public class DemoThreadPool {
    public static void main(String[] args) {
        //1 获取线程池对象
        ExecutorService service = newFixedThreadPool(3);
        //2 创建任务对象
        MyRunnable mr = new MyRunnable();

        //3 提交
        service.submit(mr);
        service.submit(mr);
        service.submit(mr);
    }
}
