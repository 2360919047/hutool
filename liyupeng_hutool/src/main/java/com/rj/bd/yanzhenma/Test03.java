package com.rj.bd.yanzhenma;
/**
 * @desc   扭曲干扰验证码
 * @author LYP
 * @time   2021-02-15
 */
import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ShearCaptcha;

public class Test03 {
	public static void main(String[] args) {
		//定义图形验证码的长、宽、验证码字符数、干扰线宽度
		ShearCaptcha captcha = CaptchaUtil.createShearCaptcha(200, 100, 4, 4);
		//ShearCaptcha captcha = new ShearCaptcha(200, 100, 4, 4);
		//图形验证码写出，可以写出到文件，也可以写出到流
		captcha.write("d:/shear.png");
		//验证图形验证码的有效性，返回boolean值
		captcha.verify("1234");
	}
}
