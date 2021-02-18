package com.rj.bd.zip;
/**
 * @desc   zip方法–打包成压缩包
 * @author LYP
 * @time   2021-02-15
 */
import java.io.File;

import cn.hutool.core.util.ZipUtil;

public class Test {
	public static void main(String[] args) {
		//将"E:\new\demo"目录下的所有内容打包到"E:\a\1.zip"文件中
        File file = ZipUtil.zip("E:\\a\\1.txt");
        System.out.println(file.getName());//运行结果：1.zip
	}
}
