package cn.itcast.demo.inputOutputStream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author : huajuan
 * create at : 2019-11-27 23:52
 * description :
 * remark :
 * @program: basics
 **/
public class PicTest {

    @Test
    public void test1() throws Exception {
        // 加密
        // 字节输入流
        FileInputStream fis = new FileInputStream("8.jpg");
        // 字节输出流
        FileOutputStream fos = new FileOutputStream("忍者.jpg");
        byte[] buffer = new byte[20];
        int len;
        while ((len = fis.read(buffer)) != -1){
            for (int i = 0; i < len; i++) {
                buffer[i] = (byte) (buffer[i] ^ 5);
            }
            fos.write(buffer, 0, len);
        }
        fis.close();
        fos.close();
    }

    @Test
    public void test2() throws Exception {
        // 解密
        FileInputStream fis = new FileInputStream("忍者.jpg");
        FileOutputStream fos = new FileOutputStream("忍者1.jpg");
        byte[] buffer = new byte[20];
        int len;
        while ((len = fis.read(buffer)) != -1){
            for (int i = 0; i < len; i++) {
                buffer[i] = (byte) (buffer[i] ^ 5);
            }
            fos.write(buffer, 0, len);
        }
        fis.close();
        fos.close();
    }
}
