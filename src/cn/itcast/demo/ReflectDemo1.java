package cn.itcast.demo;

import java.lang.reflect.Method;

/**
 * @author : huajuan
 * create at : 2019-05-12 16:09
 * description : 获取class对象的三种方式
 * remark : Reflect反射
 * @program: basics
 **/
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        //多用于配置文件,将类名定义在配置文件中.读取文件
        Class cls1 = Class.forName("cn.itcast.demo.Person");
        System.out.println(cls1);
        System.out.println("-----------------------");
        //多用于参数的传递
        Class<Person> cls2 = Person.class;
        Method[] methods = cls2.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println("-----------------------");
            //暴力反射 获取private方法
            method.setAccessible(true);
        }
        //对象的获取字节码的方式
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3 == cls2);
    }
}
