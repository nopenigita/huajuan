package cn.itcast.demo.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author : huajuan
 * create at : 2019-11-30 20:31
 * RetentionPolicy.source 源代码阶段 编译后不会有
 * RetentionPolicy.class 编译后有,JVM加载进内存后就没有了.
 * RetentionPolicy.runtime 加载进内存还有
 * 自定义注解可定义的类型有:
 * 1 所有基本数据类型（int,float,boolean,byte,double,char,long,short)
 * 2 String类型 3 Class类型 4 enum类型 5 Annotation类型 6 以上所有类型的数组
 * @program: basics
 **/
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String value() default "hello";

    int num() default 0;

}
