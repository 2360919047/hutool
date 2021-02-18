package com.rj.bd.zip;

import java.io.File;

import cn.hutool.core.util.ZipUtil;

/**
 * @desc   指定打包后的文件名及保存的目录
 * @author LYP
 * @time   2021-02-15
 *
 */
public class Test02 {
	public static void main(String[] args) {
        File file = ZipUtil.zip("E:\\a\\1.txt","E:\\a1\\abc.zip");
        System.out.println(file.getName());//运行结果：abc.zip
	}
	
}
