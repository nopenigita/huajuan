package cn.itcast.demo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author : huajuan
 * create at : 2019-05-16 22:07
 * description :
 * remark :
 * @program: basics
 **/
public class Generic {
    public static void main(String[] args) {
        Collection<Object> coll = new ArrayList<>();
        Collection<String> coll1 = new ArrayList<>();
        Collection<Number> coll2 = new ArrayList<>();
        useColl(coll);
        useColl(coll1);
        useColl(coll2);
    }

    /**
     * 设计一个方法 可以接收三个集合类型 想要接收任何类型 就要使用通配符
     *  <? extend Number></?> 能接收的类型是Number Integer 泛型的上限
     *  对泛型进行了限定 只能接收Number类型和它的子类类型Integer
     *
     *  <? super Number></?> 泛型的下限 能接收的类型是 Number 和 object
     *  只能接收Number及其父类
     */
    public static void useColl(Collection<?> coll){
    }
}
