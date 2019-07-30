package cn.itcast.demo.thread.lambda.Demo06Map;

import java.util.stream.Stream;

/**
 * @author : huajuan
 * create at : 2019-07-29 22:32
 * description :
 * remark : 将字符串类型转换成int类型
 * @program: basics
 **/
public class Demo06Map {
    public static void main(String[] args) {
        Stream<String> one = Stream.of("1","2","3","4");
        //通过map方法转换类型
        Stream<Integer> two = one.map(Integer::parseInt);
        //简化
        two.forEach(System.out::println);
    }
}
