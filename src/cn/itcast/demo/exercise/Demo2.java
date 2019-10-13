package cn.itcast.demo.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : huajuan
 * create at : 2019-09-28 01:27
 * description :
 * remark :
 * @program: basics
 **/
public class Demo2 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap(16);
        map.put(null, null);
        //传统遍历
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + s.getValue());
        }
        //JDK8 遍历
        map.forEach((k, v) -> {
            System.out.println(k + v);
        });
        // 正例:logger.debug("Processing trade with id: {} and symbol: {}", id, symbol);
    }
}
