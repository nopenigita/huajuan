package cn.itcast.demo.exercise;

/**
 * @author huajuan
 * 单例模式 懒汉式 * 推荐使用 *
 */
public class Single {
    //私有化构造器
    private Single(){}
    //私有静态变量
    private static volatile Single s = null;
    //公共方法
    public static Single getInstance(){
        if (s == null){
            synchronized (Single.class){
                if (s == null){
                    s = new Single();
                }
            }
        }
        return s;
    }

}
