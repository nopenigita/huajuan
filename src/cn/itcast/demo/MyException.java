package cn.itcast.demo;

/**
 * @author : huajuan
 * create at : 2019-05-25 00:02
 * description : 自定义异常
 * remark :
 * @program: basics
 **/
public class MyException extends RuntimeException{
    /**
     * 自定义异常
     * 1:继承异常类
     * 2:写空参和有参构造
     */
    public MyException(){
        super();
    }

    public MyException(String message){
        super(message);
    }
}
