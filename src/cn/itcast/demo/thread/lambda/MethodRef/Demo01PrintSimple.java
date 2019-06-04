package cn.itcast.demo.thread.lambda.MethodRef;

/**
 * @author : huajuan
 * create at : 2019-05-29 23:31
 * description : 创建函数式接口
 * remark :
 * @program: basics
 **/
public class Demo01PrintSimple {
    public static void printString(Printable lambda) {
        lambda.print("Hello world");
    }

    public static void main(String[] args) {
//      printString(a -> System.out.println(a));
        printString(System.out::println);
        /**
         * 双冒号为引用运算符
         */
    }
}
