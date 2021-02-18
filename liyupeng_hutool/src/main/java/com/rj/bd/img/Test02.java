package com.rj.bd.img;

import java.awt.Rectangle;

import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;

/**
 * @desc   裁剪图片
 * @author LYP
 * @time   2021-02-17
 */
public class Test02 {
	//裁剪图片
	public static void main01(String[] args) {
		ImgUtil.cut(
			    FileUtil.file("E:/img/3.jpg"), 
			    FileUtil.file("E:/img/3_result.jpg"), 
			    new Rectangle(200, 200, 100, 100)//裁剪的矩形区域
			);
	}
	//彩色照片转为黑白照片
	public static void main(String[] args) {
		ImgUtil.gray(FileUtil.file("E:/img/2.jpg"), FileUtil.file("E:/img/result.png"));
	}
}
