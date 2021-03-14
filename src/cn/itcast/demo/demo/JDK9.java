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
        // [1, 2, 3]
        System.out.println(list);
        List<String> collect = list.stream().filter(s -> s.length() != 0).collect(Collectors.toList());
        // 3
        System.out.println(collect.size());
        Set<String> set = Set.of("4","5","6");
        // [4, 5, 6]
        System.out.println(set);

        Map<String,Integer> map = Map.of("键",1,"值",2);
        // {值=2, 键=1}
        System.out.println(map);
        // class cn.itcast.demo.demo.JDK9
        System.out.println(JDK9.class);

        Single instance1 = Single.getInstance();
        Single instance = Single.getInstance();
        // true
        System.out.println(instance1 == instance);
        // 2
        System.out.println(Math.round(1.5));
        // byte 127 ~ -128
        byte b = 127;
        byte b1 = -128;
        System.out.println(b == b1);
    }
}
