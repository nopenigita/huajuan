package cn.itcast.demo.exercise;

import cn.itcast.demo.domain.Apple;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : huajuan
 * create at : 2019-07-24 20:39
 * description :
 * remark :
 * @program: basics
 **/
public class Demo1 {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        Apple apple1 =  new Apple(1,"苹果1",new BigDecimal("3.25"),10);
        Apple apple2 =  new Apple(2,"香蕉",new BigDecimal("2.89"),30);
        Apple apple3 =  new Apple(3,"荔枝",new BigDecimal("9.99"),40);
        Apple apple12 = new Apple(1,"苹果2",new BigDecimal("1.35"),20);
        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        appleList.add(apple12);
        Map<Integer, List<Apple>> groupBy = appleList.stream().filter(s -> s != null).collect(Collectors.groupingBy(Apple::getId));
        System.out.println("groupBy:"+groupBy);
        appleList.stream().forEach(Apple :: getId);
//        System.out.println(groupBy.get(1));

//        Map<Integer, Apple> appleMap = appleList.stream().collect(Collectors.toMap(Apple::getId, a -> a,(k1,k2)->k1));
//        System.out.println(appleMap);

//        List<Apple> filterList = appleList.stream().filter(a -> a.getName().equals("香蕉")).collect(Collectors.toList());
//        List<Apple> collect = appleList.stream().filter(s -> s != null).collect(Collectors.toList());
//        System.out.println(collect);
    }
}
