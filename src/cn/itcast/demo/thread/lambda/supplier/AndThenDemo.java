package cn.itcast.demo.thread.lambda.supplier;

import java.util.function.Consumer;

/**
 * @author : huajuan
 * create at : 2019-06-04 22:06
 * description : 想要实现组合,需要两个Lambda表达式,andthen先执行一步再执行一步,就省去了一些步骤.
 * remark :
 * @program: basics
 **/
public class AndThenDemo {
    public static void main(String[] args) {
        String name = "小明";
        method(name, s -> System.out.println(s + "打篮球"),
                s -> System.out.println(s + "打排球"));
    }

    public static void method(String s, Consumer<String> one, Consumer<String> two) {
//        one.accept(s);
//        two.accept(s);
        //s先进行one的操作,再执行two的操作
        one.andThen(two).accept(s);
    }
}
