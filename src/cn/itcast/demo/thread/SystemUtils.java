package cn.itcast.demo.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;

/**
 * @author : huajuan
 * create at : 2019-07-12 21:05
 * description :
 * remark :
 * @program: basics
 **/
public class SystemUtils {

    private static final OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();

    private static final RuntimeMXBean vm = ManagementFactory.getRuntimeMXBean();

    /**
     * 获取操作系统名称
     * @return
     */
    public static String getOsName(){
        return os.getName();
    }

    /**
     * 获取系统版本
     * @return
     */
    public static String getOsVersion(){
        return os.getVersion();
    }

    /**
     * 获取CPU个数
     * @return
     */
    public static int getCpuCount(){
        return os.getAvailableProcessors();
    }

    /**
     * JVM最大使用内存
     * @return
     */
    public static long getMemory() {
        return Runtime.getRuntime().maxMemory();
    }
}
