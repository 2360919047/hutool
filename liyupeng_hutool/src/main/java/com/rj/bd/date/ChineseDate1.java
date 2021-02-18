package com.rj.bd.date;
/**
 * @desc   农历日期
 * @author LYP
 * @time   2021-02-14
 */
import cn.hutool.core.date.ChineseDate;
import cn.hutool.core.date.DateUtil;

public class ChineseDate1 {
	public static void main(String[] args) {
		//通过农历构建
		ChineseDate chineseDate = new ChineseDate(1992,12,14);
		
		//通过公历构建
		ChineseDate date = new ChineseDate(DateUtil.parseDate("2021-02-12"));
		// 一月
		String a = date.getChineseMonth();
		System.out.println(a);
		// 正月
		String b = date.getChineseMonthName();
		System.out.println(b);
		// 初一
		String c = date.getChineseDay();
		System.out.println(c);
		// 庚子
		String d = date.getCyclical();
		// 生肖：牛
		String e = date.getChineseZodiac();
		System.out.println(e);
		// 传统节日（部分支持，逗号分隔）：春节
		String f = date.getFestivals();
		System.out.println(f);
		//辛丑牛年 正月初一
		String g = date.toString();
		System.out.println(g);

	}
}
