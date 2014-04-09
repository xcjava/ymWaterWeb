package com.ymsino.water.view.web.common;

import java.security.MessageDigest;

/**
 * MD5.java MD5加密算法
 *
 * @author xiaocong
 * @email xcjava@gmail.com
 */
public class MD5 {

    /**
     * 构造方法
     */
    public MD5() {
    }

    /**
     * 加密
     * @param str String
     * @return String
     */
    public final static String getMD5(String str) {
        /* 判断是否为null，是则返回 null */
        if (str == null) {
            return str;
        }

        char hexDigits[] = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd',
            'e', 'f'};

        byte[] strTemp = str.getBytes();
        MessageDigest md5Temp = null;
        try {
            md5Temp = MessageDigest.getInstance("md5");
        } catch (java.security.NoSuchAlgorithmException nsae) {
            System.out.println("Exception: " + nsae.toString());
            return null;
        }
        md5Temp.update(strTemp);

        byte[] md5 = md5Temp.digest();
        int md5Length = md5.length;
        char md5Str[] = new char[md5Length * 2];

        int j = 0;
        for (int i = 0; i < md5Length; i++) {
            byte byte0 = md5[i];
            md5Str[j++] = hexDigits[byte0 >>> 4 & 0xf];
            md5Str[j++] = hexDigits[byte0 & 0xf];
        }

        return new String(md5Str);
    }

}
