package com.rj.bd.convert;

/**
 * @desc   自定义转换
 * @author LYP
 * @time   2021-02-14
 */
import cn.hutool.core.convert.Converter;

public class Test02 implements Converter<String>{

	public String convert(Object value, String defaultValue) throws IllegalArgumentException {
		return "Custom: " + value.toString();
	}
	
	
}

