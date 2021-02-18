package com.rj.bd.date;
/**
 * @desc   Hutool工具类之日期时间工具——DateUtil
 * @author LYP
 * @time   2021-02-14
 */
import java.util.Date;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;

public class DateUtil1 {
	public static void main(String[] args) {
        DateTime dateTime = new DateTime("2021-2-14 12:50:07", "yyyy-MM-dd HH:mm:ss");
        // 获取日期成员（年、季度、月、日）
        int year = dateTime.year();// 年
        System.out.println("year = " + year);
        int month = dateTime.month();// 月份
        System.out.println("month = " + month);
        int dayOfWeek = dateTime.dayOfWeek();// 周几
        System.out.println("dayOfWeek = " + dayOfWeek);
        int dayOfMonth = dateTime.dayOfMonth();// 此月第N天
        System.out.println("dayOfMonth = " + dayOfMonth);
        // 调整日期时间
        DateTime dateTime3 = dateTime.offset(DateField.DAY_OF_MONTH, -1);
        System.out.println(dateTime3.toString());
        
        System.out.println("-------------------------------------------------------");
        
        // 日期字符串请补全为2位数字
        String str1 = "2017-09-14";
        String str2 = "2017-09-14 21:03:01";
        // 自动感应格式
        Date date1 = cn.hutool.core.date.DateUtil.parse(str1);
        Date date2 = cn.hutool.core.date.DateUtil.parse(str2);
        System.out.println("date1:"+date1);
        System.out.println("date2:"+date2);
        // 手动设置格式（其中DateTime是可以完全替代Date的一个子类）
        DateTime dateTime1 = cn.hutool.core.date.DateUtil.parse(str1, "yyyy-MM-dd");
        DateTime dateTime2 = cn.hutool.core.date.DateUtil.parse(str2, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTime1);
        System.out.println(dateTime2);
        
        
    }
}
