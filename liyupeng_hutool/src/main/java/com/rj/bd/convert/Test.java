package com.rj.bd.convert;

import java.util.Date;
/**
 * @desc   类型转换工具类
 * @author LYP
 * @time   2021-02-14
 */
import java.util.List;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.convert.Converter;
import cn.hutool.core.date.DateUtil;

public class Test{
	public static void main(String[] args) {
		//转换为字符串
		int a = 1;
		String aStr = Convert.toStr(a);
		
		//数组转换为字符串
		long[] b = {1,2,3,4,5};
		String bStr = Convert.toStr(b);
		
		//转换为指定类型数组
		String[] c = { "1", "2", "3", "4" };
		Integer[] intArray = Convert.toIntArray(c);
				
		//转换为集合
		Object[] d = {"a", "你", "好", "", 1};
		List<?> list = Convert.convert(List.class, d);
		System.out.println(list);
		
		//半角转全角
		String e = "123456789";
		String sbc = Convert.toSBC(e);
		System.out.println(sbc);
		
		//全角转半角
		String f = "１２３４５６７８９";
		String dbc = Convert.toDBC(f);
		

		

	}

}

