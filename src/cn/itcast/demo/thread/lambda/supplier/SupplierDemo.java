package cn.itcast.demo.thread.lambda.supplier;

import java.util.function.Supplier;

/**
 * @author : huajuan
 * create at : 2019-06-04 21:59
 * description :
 * remark :
 * @program: basics
 **/
public class SupplierDemo {
    public static void main(String[] args) {
        System.out.println(getString(() -> "Hello"));
    }

    public static String getString(Supplier<String> lambda) {
        return lambda.get();
    }
}
