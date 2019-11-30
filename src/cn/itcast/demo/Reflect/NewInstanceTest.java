package cn.itcast.demo.Reflect;

import cn.itcast.demo.bean.Person;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author : huajuan
 * create at : 2019-11-30 15:45
 * description :
 * remark : 通过反射创建对应的运行时类的对象
 * @program: basics
 **/
public class NewInstanceTest {

    @Test
    public void test1() throws IllegalAccessException, InstantiationException {
        Class<Person> clazz = Person.class;
        // class cn.itcast.demo.bean.Person
        System.out.println(clazz);
        // 创建对应person类的实例 获取运行时类
        Person o = clazz.newInstance();
        System.out.println(o);
    }

    @Test
    public void test2() throws IOException {
        // 没有定义properties文件,不能运行
        Properties pros = new Properties();
        // 与module路径保持一级
        FileInputStream fis = new FileInputStream("jdbc.properties");
        pros.load(fis);
        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println(user + password);
        // 与src路径保持一级
        InputStream is = NewInstanceTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
        pros.load(is);
    }

    @Test
    public void test3(){
        ClassLoader classLoader = NewInstanceTest.class.getClassLoader();
        // jdk.internal.loader.ClassLoaders$AppClassLoader@4f8e5cde
        System.out.println(classLoader);
        ClassLoader classLoader1 = NewInstanceTest.class.getClass().getClassLoader();
        // null
        System.out.println(classLoader1);
    }
}
