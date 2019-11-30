package cn.itcast.demo.demo;

import cn.itcast.demo.interview.Single;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author : huajuan
 * create at : 2019-05-24 23:43
 * description : 静态集合工厂方法 对集合的优化 方便创建少量元素的集合 map实例
 * remark :
 * @program: basics
 **/
public class JDK9 {

    public static void main(String[] args) {
        List<String> list = List.of("1","2","3");
        System.out.println(list);
        List<String> collect = list.stream().filter(s -> s.length() != 0).collect(Collectors.toList());
        System.out.println(collect.size());
        Set<String> set = Set.of("4","5","6");
        System.out.println(set);

        Map<String,Integer> map = Map.of("键",1,"值",2);
        System.out.println(map);

        System.out.println(JDK9.class);

        Single instance1 = Single.getInstance();
        Single instance = Single.getInstance();
        System.out.println(instance1 == instance);

        System.out.println(Math.round(1.5));
    }
}
