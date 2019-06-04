package cn.itcast.demo.thread.lambda.MethodRef1;

/**
 * @author : huajuan
 * create at : 2019-05-30 00:21
 * description :
 * remark :
 * @program: basics
 **/
public class Man extends Human {

    @Override
    public void sayHello() {
        System.out.println("EMMMM");
    }

    public void method(Greetable g){
        g.greetable();
    }

    public void show(){
        //调用Method方法
        method(()->{
            //写功能体
            new Human().sayHello();
        });
    }

    public void show1(){
        //调用Method方法
        method(()->{
            //写功能体
            super.sayHello();
        });
    }

    public void show2(){
        //调用Method方法
        method(super::sayHello);
        method(this::sayHello);
    }
}
