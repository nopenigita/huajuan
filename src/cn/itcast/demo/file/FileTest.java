package cn.itcast.demo.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author : huajuan
 * create at : 2019-11-26 21:27
 * description :
 * remark :
 * @program: basics
 **/
public class FileTest {

    @Test
    public void test() {
        File file = new File("hello.txt");
        File file1 = new File("/Users/huajuan/he.txt");
        File file2 = new File("/Users/huajuan");
        // 获取绝对路径
        System.out.println(file.getAbsolutePath());
        // 路径
        System.out.println(file.getPath());
        // 名字
        System.out.println(file.getName());
        // 父级目录
        System.out.println(file.getParent());
        // 长度
        System.out.println(file.length());
        // 最近修改时间
        System.out.println(new Date(file.lastModified()));
        System.out.println("--------------------");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
        System.out.println("--------------------");

        // 获取当前目录下的文件名 方式1
        String[] list = file2.list();
        for (String s : list) {
            System.out.println(s);
        }
        // 获取当前目录下的文件名 方式2 推荐使用
        System.out.println();
        File[] files = file2.listFiles();
        for (File file3 : files) {
            System.out.println(file3);
        }
        System.out.println();
        // 把文件重命名为指定的文件路径
        boolean b = file1.renameTo(file);
        System.out.println(b);
    }

    @Test
    public void test1() {
        File file = new File("hello.txt");
        // 是不是文件夹
        System.out.println(file.isDirectory());
        // 是不是文件
        System.out.println(file.isFile());
        // 是否存在
        System.out.println(file.exists());
        // 可读?
        System.out.println(file.canRead());
        // 可写?
        System.out.println(file.canWrite());
        // 隐藏?
        System.out.println(file.isHidden());
    }

    @Test
    public void test2() throws IOException {
        File file = new File("hi.txt");
        if (!file.exists()) {
            // 创建文件
            file.createNewFile();
            System.out.println("创建成功");
        } else {
            // 删除文件
            file.delete();
            System.out.println("删除成功");
        }
        // 文件目录的创建 方式1
        boolean b = file.mkdir();
        // 文件目录的创建 方式2
        boolean b1 = file.mkdirs();
        System.out.println(b);
        System.out.println(b1);
    }

}
