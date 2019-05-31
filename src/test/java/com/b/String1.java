package com.b;

import org.junit.Test;

import java.util.regex.Pattern;

//字符串和正则表达式的处理
public class String1 {
    /**
     * String字符串处理
     */
    @Test
    public void string(){
        //定义字符串
        String str="www.baidu.com";
        //length方法获取字符串的长度
        int len=str.length();
        //输出字符串长度
        System.out.println("str的长度为："+len);
        //字符串拼接
        String str1=str.concat("0624");
        //输出拼接后的字符串
        System.out.println(str1);
        //返回指定索引为2 处的 char 值
        System.out.println(str.charAt(2));
        //返回指定子字符串"ww"在str字符串中第一次出现处的索引
        System.out.println(str.indexOf("ww"));
        //返回指定字符在str字符串中最后一次出现处的索引
        System.out.println(str.lastIndexOf("w"));
        //输出str字符串的全大写
        System.out.println(str.toUpperCase());
        //输出截取索引为4的之后的所有字符
        System.out.println(str.substring(4));
    }

    @Test
    public void Regex(){
        //定义一个content字符串
        String content = "I am girl " + "from hainan";
        //定义一个pattern字符串
        String pattern = ".*girl.*";
        //判断content字符串中是否包含pattern子字符串
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'girl' 子字符串? " + isMatch);
        //匹配手机号码的正则表达式
        String regex="^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$";
        //匹配密码的正则表达式 字母、数字组成 至少8位
        String regex1 = "\\d{15}|\\d{17}[\\dxX]";

    }
}
