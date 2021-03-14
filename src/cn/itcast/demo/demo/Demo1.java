package cn.itcast.demo.demo;

import cn.itcast.demo.bean.Apple;

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

        /**
         * 分组 List里面的对象元素，以某个属性来分组，例如，以id分组，将id相同的放在一起：
         */
        Map<Integer, List<Apple>> groupBy = appleList.stream().collect(Collectors.groupingBy(Apple::getId));
        System.err.println("groupBy:" + groupBy);

        /**
         *  List -> Map
         *  需要注意的是：
         *  toMap 如果集合对象有重复的key，会报错Duplicate key ....
         *  apple1,apple12的id都为1。
         *  可以用 (k1,k2)->k1 来设置，如果有重复的key,则保留key1,舍弃key2
         */
        Map<Integer, Apple> appleMap = appleList.stream().collect(Collectors.toMap(Apple::getId, a -> a,(k1,k2)->k1));
        System.err.println("appleMap:" + appleMap);

        /**
         * 从集合中过滤出来符合条件的元素
         */
        List<Apple> filterList = appleList.stream().filter(a -> a.getName().equals("香蕉")).collect(Collectors.toList());
        System.err.println("filterList:"+filterList);

        /**
         * 计算 总金额
         */
        BigDecimal totalMoney = appleList.stream().map(Apple::getMoney).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.err.println("totalMoney:"+totalMoney);
    }
}
