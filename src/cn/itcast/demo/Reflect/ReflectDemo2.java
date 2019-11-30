package cn.itcast.demo.Reflect;

import cn.itcast.demo.bean.Person;

import java.lang.reflect.Field;

/**
 * @author : huajuan
 * create at : 2019-10-30 22:54
 * description :
 * remark :
 * @program: basics
 **/
public class ReflectDemo2 {

    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        // 获取所有public修饰符的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        // 获取指定名称的Public修饰符的成员变量age,person对象里没定义,这里写a只是为了演示...
        Field field = personClass.getField("age");
        // field成员变量 用于get/set
        Person p = new Person();
        field.set(p, "张三");
        field.get(p);

        // 获取所有修饰符的成员变量(但是如果要获取private修饰的,必须要使用暴力反射)
        Field[] fields1 = personClass.getDeclaredFields();
        for (Field field1 : fields1) {
            System.out.println(field1);
        }
        System.out.println("------------------------------");
        Field d = personClass.getDeclaredField("sex");
        d.setAccessible(true);
        Object o = d.get(p);
        System.out.println(o);

    }
}
