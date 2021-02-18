package com.rj.bd.img;
/**
 * @desc   图片按比例缩放
 * @author LYP
 * @time   2021-02-17
 */
import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;

public class Test {
	public static void main(String[] args) {
		ImgUtil.scale(
			    FileUtil.file("E:/img/1.jpg"), 
			    FileUtil.file("E:/img/1_xiao.jpg"), 
			    0.5f//缩放比例
			);
	}
}
