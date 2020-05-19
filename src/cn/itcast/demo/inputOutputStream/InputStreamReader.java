package cn.itcast.demo.inputOutputStream;

import java.io.FileInputStream;

/**
 * @author : Hiccup
 * create at : 2020/4/21 9:32 下午
 * description :
 * remark :
 **/
public class InputStreamReader {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("hello.txt");
        java.io.InputStreamReader isr = new java.io.InputStreamReader(fis, "UTF-8");
        char[] chars = new char[20];
        int len;
        while ((len = isr.read(chars)) != -1){
            String s = new String(chars, 0, len);
            System.out.println(s);
        }
        isr.close();
    }
}
