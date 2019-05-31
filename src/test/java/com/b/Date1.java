package com.b;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//时间格式转换示例
public class Date1 {
    /**
     * Date类型
     */
    @Test
    public void date(){
        //创建date对象  获取当前系统时间
        Date date=new Date();
        //生命一个Date类型变量
        Date date1;
        //输出当前时间
        System.out.println(date.toString());
        System.out.println(date);
        //使用 SimpleDateFormat 格式化日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //format: 按指定的目标格式把Date对象转换为String
        System.out.println("当前时间："+sdf.format(date));
        try{
            //parse: 按指定的格式把String转换为Date对象
            date1=sdf.parse("1997-06-24 09:20:20");
            //输出按指定的目标格式把Date对象转换为String的数
            System.out.println(sdf.format(date1));
            //compareTo 比较两个时间的顺序  输出为 1 或 -1
            System.out.println(date.compareTo(date1));
            //比较两个时间是否相等
            System.out.println(date.equals(date1));
            //当调用此方法的Date对象在指定日期之后返回true,否则返回false
            System.out.println(date.after(date1));
            //调用此方法的Date对象在指定日期之前返回true,否则返回false。
            System.out.println(date.before(date1));

        }catch (ParseException e){
            e.printStackTrace();
        }

        //使用printf格式化日期
        // c 包括全部日期和时间信息
        System.out.printf("全部日期和时间信息：%tc%n",date);
        // f "年-月-日"格式
        System.out.printf("年-月-日格式：%tF%n",date);
        // d  月/日/年格式
        System.out.printf("月/日/年格式：%tD%n",date);
        // r HH:MM:SS PM格式（12时制）
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        // t HH:MM:SS格式（24时制）
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
        // R HH:MM格式（24时制）
        System.out.printf("HH:MM格式（24时制）：%tR",date);
    }
}
