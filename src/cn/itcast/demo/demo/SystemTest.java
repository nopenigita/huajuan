package cn.itcast.demo.demo;

/**
 * @author : Hiccup
 * create at : 2020/4/19 5:17 下午
 * description :
 * remark :
 **/
public class SystemTest {
    public static void main(String[] args) {
        // 查看JAVA版本
        System.out.println(System.getProperty("java.version"));
        // JAVA安装目录
        System.out.println(System.getProperty("java.home"));
        // 获取系统当前毫秒值
        long l = System.currentTimeMillis();
        System.out.println(l);
        // 确定当前的系统属性
        System.out.println(System.getProperties());
    }
}
