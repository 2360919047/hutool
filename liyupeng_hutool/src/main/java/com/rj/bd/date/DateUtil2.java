package com.rj.bd.date;
/**
 * @desc   Hutool工具类之日期时间工具——DateUtil
 * @author LYP
 * @time   2021-02-14
 */
import java.util.Date;

import cn.hutool.core.date.DateUtil;

public class DateUtil2 {

	public static void main(String[] args) {
		
		// 日期格式化为字符串
		
        String str1 = "2017-09-14";
        // 自动感应格式
        Date date1 = cn.hutool.core.date.DateUtil.parse(str1);
        // 格式化为指定格式字符串
        String s1 = cn.hutool.core.date.DateUtil.format(date1, "yyyy年MM月dd日");
        System.out.println("s1 = " + s1);
        // 常用格式格式化
        String s2 = cn.hutool.core.date.DateUtil.formatDate(date1);
        System.out.println("s2 = " + s2);
        
        System.out.println("---------------------------------");
        // 获取日期成员
        
        String str2 = "2017-09-14";
        // 自动感应格式
        Date date2 = DateUtil.parse(str1);
        // 获取指定日期成员（通过DateTime同样可以完成）
        int year = DateUtil.year(date1);
        System.out.println("year = " + year);
        int dayOfMonth = DateUtil.dayOfMonth(date1);
        System.out.println("dayOfMonth = " + dayOfMonth);
        System.out.println("---------------------------------");
        
        // 距今年龄
        int age = DateUtil.ageOfNow("2001-01-22");
        System.out.println("age = " + age);
        // 是否闰年
        boolean leapYear = DateUtil.isLeapYear(2021);
        System.out.println("leapYear = " + leapYear);
	}
}
