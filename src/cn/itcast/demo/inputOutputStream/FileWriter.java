package cn.itcast.demo.inputOutputStream;

import java.io.File;
import java.io.FileReader;

/**
 * @author : Hiccup
 * create at : 2020/4/21 9:36 下午
 * description :
 * remark :
 **/
public class FileWriter {
    public static void main(String[] args) throws Exception{
        File file = new File("hello1.txt");
        java.io.FileWriter fw = new java.io.FileWriter(file);
        fw.write("I HAVE A DREAM\n");
        fw.close();

    }
    public static void readWriter() throws Exception{
        File file = new File("hello.txt");
        File file1 = new File("hello2.txt");
        FileReader fr = new FileReader(file);
//      FileInputStream fr = new FileInputStream(file);
        java.io.FileWriter fw = new java.io.FileWriter(file1);
//      FileOutputStream fw = new FileOutputStream(file1);
        char[] chars = new char[5];
//      byte[] bytes = new byte[1024];
        int len;
        while ((len = fr.read(chars)) != -1){
            fw.write(chars, 0, len);
        }
        fr.close();
    }
}
