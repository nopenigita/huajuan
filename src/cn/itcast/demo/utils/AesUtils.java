package cn.itcast.demo.utils;

import org.apache.commons.lang.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * @author HuaJuan
 */
public class AesUtils {

    private static final String AES_KEY = "YIORGA4dBYp6y7u8";

    /**
     * Encrypt by aes.
     *
     * @param content info
     * @param key     key
     */
    public static String aesEncrypt(String content, String key) {
        if (StringUtils.isBlank(key) || key.length() != 16) {
            key = AES_KEY;
        }

        try {
            byte[] keyBytes = key.getBytes("UTF-8");
            SecretKeySpec skeySpec = new SecretKeySpec(keyBytes, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            byte[] encrypted = cipher.doFinal(content.getBytes("utf-8"));
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * Encrypt by aes.
     */
    public static String aesEncrypt(String content) {
        if (StringUtils.isBlank(content)) {
            return null;
        }
        return aesEncrypt(content, AES_KEY);
    }

    /**
     * Decrypt by aes.
     *
     * @param content info
     * @param key     key
     */
    public static String aesDecrypt(String content, String key) {
        if (StringUtils.isBlank(key) || key.length() != 16) {
            key = AES_KEY;
        }
        try {
            byte[] keyBytes = key.getBytes("UTF-8");
            SecretKeySpec skeySpec = new SecretKeySpec(keyBytes, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);

            byte[] encrypted1 = Base64.getDecoder().decode(content);
            byte[] original = cipher.doFinal(encrypted1);

            return new String(original, "UTF-8");

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * Decrypt by aes.
     */
    public String aesDecrypt(String content) {
        return aesDecrypt(content, AES_KEY);
    }

    public static void main(String[] args) {
        String s = "hello world";
        String m = aesEncrypt(s);
        String n = aesDecrypt(m, AES_KEY);
        System.out.println(m);
        System.out.println(n);

    }
}
