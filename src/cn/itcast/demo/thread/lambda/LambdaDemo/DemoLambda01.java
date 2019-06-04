package cn.itcast.demo.thread.lambda.LambdaDemo;

/**
 * @author : huajuan
 * create at : 2019-05-27 23:55
 * description :
 * remark :
 * @program: basics
 **/
public class DemoLambda01 {
    public static void main(String[] args) {
        //使用Lambda表达式完成InvokeCook方法的调用
        invokeCook(()->{
            System.out.println("炒大米饭");
        });
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
