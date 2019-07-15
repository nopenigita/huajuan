package cn.itcast.demo.thread.stream;

import java.util.stream.Stream;

/**
 * @author : huajuan
 * create at : 2019-06-04 23:34
 * description :
 * remark :
 * @program: basics
 **/
public class Demo01Filter {
    public static void main(String[] args) {
        //获取流
        Stream<String> one = Stream.of("宋江", "卧龙", "孔明", "诸葛亮", "及时雨");

        //获取一个子集流 要求 名字长度是2的
        Stream<String> two = one.filter((code) -> code.length() == 2);

        //使用了一个foreach 获取流中的每一个元素 接收参数是一个消费式函数式接口
        two.forEach(System.out::println);
    }
}
