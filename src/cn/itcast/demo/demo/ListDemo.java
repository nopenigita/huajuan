package cn.itcast.demo.demo;

import java.util.HashSet;

/**
 * @author : huajuan
 * create at : 2019-11-21 23:11
 * description :
 * remark :
 * @program: basics
 **/
public class ListDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("3");
        // [1, 2, 3]
        System.out.println(set);
    }

}
