package cn.itcast.demo.interview;

/**
 * @author : Hiccup
 * create at : 2020/4/24 12:05 上午
 * description : 静态内部类实现单例
 * remark :
 **/
public class Single1 {

    /** 私有化构造器 */
    private Single1(){}

    /** 静态内部类 */
    private static class SingleInstance{
        private static final Single1 instance = new Single1();
    }

    /** 访问该实例的全局访问点 */
    public static Single1 getInstance(){
        return SingleInstance.instance;
    }

}

class SingleDemo{
    public static void main(String[] args) {
        Single1 s1 = Single1.getInstance();
        Single1 s2 = Single1.getInstance();
        System.out.println(s1 == s2);
    }
}
