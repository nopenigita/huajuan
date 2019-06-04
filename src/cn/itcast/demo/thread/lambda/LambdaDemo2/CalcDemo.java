package cn.itcast.demo.thread.lambda.LambdaDemo2;

/**
 * @author : huajuan
 * create at : 2019-05-28 23:33
 * description :
 * remark :
 * @program: basics
 **/
public class CalcDemo {
    public static void main(String[] args) {
        invokeCalc(120, 130, (x, y) -> x + y);
    }

    public static void invokeCalc(int a, int b, Calculator calc) {
        int sum = calc.calc(a, b);
        System.out.println(sum);
    }
}
