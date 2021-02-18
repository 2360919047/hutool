package com.rj.bd.erweima;
/**
 * @desc   识别二维码
 * @author LYP
 * @time   2021-02-15	
 */
import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;

public class Test03 {
	public static void main(String[] args){
        String result = QrCodeUtil.decode(FileUtil.file("E:\\a\\QrCode.jpg"));
        System.out.println(result);//运行结果：https://www.bilibili.com/
    }
}
