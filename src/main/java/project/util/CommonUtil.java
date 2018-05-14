package project.util;

import java.io.UnsupportedEncodingException;

/**
 * 常用工具类
 *
 * @author
 * @create 2018-05-14 17:44
 **/

public class CommonUtil {

    /**
     * 字符串乱码处理
     * @param str
     * @return
     */
    public static String StringFormatToUtf8(String str){
        try {
            return new String(str.getBytes("ISO-8859-1"),"UTF8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static String StringFormatToUtf8(String str,String format){
        try {
            return new String(str.getBytes(format),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }
}
