package cn.itcast.demo;

/**
 * @author huajuan
 * 单例模式 懒汉式 * 推荐使用 *
 */
public class Single {

    private Single(){}

    private static volatile Single s = null;

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
