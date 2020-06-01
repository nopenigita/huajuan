package cn.itcast.demo.demo;

import org.apache.commons.lang.StringUtils;

/**
 * @author : Hiccup
 * create at : 2020/5/24 10:15 下午
 * description :
 * remark : 将一个字符串进行反转,将字符串中指定部分进行反转
 **/
public class StringDemo {

    public static void main(String[] args) {
        String str1 = reverse1("jkljefi", 1, 4);
        System.out.println(str1);
        System.out.println("--------------");
    }

    public static String reverse(String str, int startIndex, int endIndex){
        if (StringUtils.isNotEmpty(str)){
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++,y--){
                char tmp = arr[x];
                arr[x] = arr[y];
                arr[y] = tmp;
            }
            return new String(arr);
        }
        return null;
    }

    public static String reverse1(String str, int startIndex, int endIndex){
        if (StringUtils.isNotEmpty(str)){
            String reverStr = str.substring(0, startIndex);
            for (int i = endIndex; i >= startIndex; i--){
                reverStr += str.charAt(i);
            }
            reverStr += str.substring(endIndex + 1);
            return reverStr;
        }
        return null;
    }

}
