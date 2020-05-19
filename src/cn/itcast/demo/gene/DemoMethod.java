package cn.itcast.demo.gene;

/**
 * @author : Hiccup
 * create at : 2020/1/28 6:19 下午
 * description :
 * remark :
 **/
public class DemoMethod {
    public static void main(String[] args) {
        DemoMethod de = new DemoMethod();
        de.method(1);
    }
    public <T> void method(T mvp){
        System.out.println(mvp.getClass());
    }

    public <M> M get(M m){
        return m;
    }
}
