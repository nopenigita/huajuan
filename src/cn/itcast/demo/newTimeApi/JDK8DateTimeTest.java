package cn.itcast.demo.newTimeApi;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author : huajuan
 * create at : 2019-12-08 20:50
 * description :
 * remark :
 * @program: basics
 **/
public class JDK8DateTimeTest {

    @Test
    public void test1(){
        // 2020-04-21
        LocalDate date = LocalDate.now();
        // 22:43:15.420856
        LocalTime time = LocalTime.now();
        // 2020-04-21T22:43:15.420906
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
    }

    @Test
    public void test2() throws ParseException {
        // JDK8 之前的API测试
        Date d = new Date();
        // 格式化 日期 转 字符串  解析 字符串 转 日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // Tue Apr 21 22:44:47 CST 2020
        System.out.println(d);
        String format = sdf.format(d);
        // 2020/4/21 下午10:45
        System.out.println(format);

        String str = "2020-08-09 15:30:36";
        Date parse = sdf.parse(str);
        System.out.println(parse);


    }
}
