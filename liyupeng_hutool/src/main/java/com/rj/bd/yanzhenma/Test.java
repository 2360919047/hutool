package com.rj.bd.yanzhenma;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.lang.Console;

/**
 * @desc   线性验证码
 * @author LYP
 * @time   2021-02-15
 */
public class Test {
	public static void main(String[] args) {
		//定义图形验证码的长和宽
		LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);

		//图形验证码写出，可以写出到文件，也可以写出到流
		lineCaptcha.write("d:/line.png");
		//输出code
		Console.log(lineCaptcha.getCode());
		//验证图形验证码的有效性，返回boolean值
		lineCaptcha.verify("1234");

		//重新生成验证码
		lineCaptcha.createCode();
		lineCaptcha.write("d:/line.png");
		//新的验证码
		Console.log(lineCaptcha.getCode());
		//验证图形验证码的有效性，返回boolean值
		lineCaptcha.verify("1234");
	}
}
