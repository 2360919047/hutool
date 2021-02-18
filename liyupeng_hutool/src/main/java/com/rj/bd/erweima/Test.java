package com.rj.bd.erweima;
/**
 * @desc   生成二维码
 * @author LYP
 * @time   2021-02-15
 */
import java.io.File;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;

public class Test {
	public static void main(String[] args) {
		//生成指定url对应的二维码到文件，宽和高都是300像素
        File file = FileUtil.file("E:\\a\\QrCode.jpg");
        QrCodeUtil.generate("https://www.bilibili.com/", 300, 300, file);
        
	}
}
