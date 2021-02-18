package com.rj.bd.yanzhenma;
/**
 * @desc   圆圈干扰验证码
 * @author LYP
 * @time   2021-02-15
 */
import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;

public class Test02 {
	public static void main(String[] args) {
		//定义图形验证码的长、宽、验证码字符数、干扰元素个数
		CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(200, 100, 4, 20);
		//CircleCaptcha captcha = new CircleCaptcha(200, 100, 4, 20);
		//图形验证码写出，可以写出到文件，也可以写出到流
		captcha.write("d:/circle.png");
		//验证图形验证码的有效性，返回boolean值
		captcha.verify("1234");
	}
}
