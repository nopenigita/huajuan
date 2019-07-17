package cn.itcast.demo.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * @author : huajuan
 * create at : 2019-07-17 21:38
 * description :
 * remark :
 * @program: basics
 **/
public class OptionalTest {

    /**
     * optional.of(T t)
     * optional.ofNullable(T t)
     */
    @Test
    public void test1(){
        Girl girl = new Girl();
        Optional<Girl> girl1 = Optional.of(girl);
    }

    @Test
    public void test2(){
        Girl girl = new Girl();
        girl = null;
        Optional<Girl> girl1 = Optional.ofNullable(girl);
        System.out.println(girl);
    }
}
