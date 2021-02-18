package com.rj.bd.erweima;
/**
 * @desc   为生成的二维码增加logo图片
 * @author LYP
 * @time   2021-02-15
 */
import java.io.File;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

public class Test02 {
	public static void main(String[] args){
        //设置二维码的宽和高都是300像素
        QrConfig config = new QrConfig(300, 300);
        //设置边距，既二维码和背景之间的边距
        config.setMargin(1);
        //设置二维码中的logo图片
        config.setImg("E:\\img\\1.jpg");

        File file = FileUtil.file("E:\\a\\abc.jpg");
        QrCodeUtil.generate("https://www.bilibili.com/", config, file);

    }
}
