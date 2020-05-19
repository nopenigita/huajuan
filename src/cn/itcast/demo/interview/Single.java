package cn.itcast.demo.interview;

import java.io.ObjectStreamException;

/**
 * @author huajuan
 * 单例模式 懒汉式 * 推荐使用 *
 */
public class Single {
    /**
     * 私有化构造器
     */
    private Single(){}

    /**
     * 私有静态成员变量 volatile 可解决DCL失效问题
     */
    private volatile static Single s = null;

    /**
     * 公共方法 会有线程安全问题 所以使用synchronized修饰
     */
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

    /**
     * 避免反序列化造成单例失效
     */
    public Object readResolve() throws ObjectStreamException {
        return s;
    }

}
