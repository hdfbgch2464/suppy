package com.zjjzfy.common.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Created by IntelliJ IDEA.
 * Author: jackshenonly
 * Date: 17/8/31
 * Time: 17:02
 */
public class Md5 {

    public static String getMD5(String str, boolean isUpper) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            String md5=new BigInteger(1, md.digest()).toString(16);
            //BigInteger会把0省略掉，需补全至32位
            if(isUpper){
                return fillMD5(md5).toUpperCase();
            }else {
                return fillMD5(md5);
            }
        } catch (Exception e) {
            throw new RuntimeException("MD5加密错误:"+e.getMessage(),e);
        }
    }

    private static String fillMD5(String md5){
        return md5.length()==32?md5:fillMD5("0"+md5);
    }

    /**
     *
     * @Description
     * 测试
     * @Author jackshenonly
     * @Time 17:02
     * @Date 17/8/31
     */
    public static void main(String[] args) throws Exception {
        String str = "101362226199404271210";
        System.out.println("md5:"+getMD5(str,true));
        System.out.println("length:"+getMD5(str,true).length());
    }
}
