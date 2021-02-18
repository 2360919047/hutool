package com.rj.bd.test;


import cn.hutool.core.util.RandomUtil;

public class Test {

	public static void main(String[] args) {
		System.out.println(RandomUtil.randomString(18)); //获取一个随机字符串(只包含数字和字符)
		System.out.println(RandomUtil.randomDay(1, 5));//以当前为准，随机产生一个日期
		System.out.println(RandomUtil.randomStringUpper(16));//随机字符串(只包含数字和大写字符)
		
	}
}
