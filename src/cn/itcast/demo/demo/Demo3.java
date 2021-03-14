package cn.itcast.demo.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Hiccup
 * create at : 2021/3/8 9:15 下午
 * description :
 * remark :
 **/
public class Demo3 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "zhangsan");
        String s = (String)map.get("sex");
        System.out.println(s);
    }
}
