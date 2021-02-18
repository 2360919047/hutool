package com.rj.bd.Io;
/**
 * @desc   实现文件复制
 * @author LYP
 * @time   2021-02-15
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;

public class Test {
	public static void main(String[] args) {
		BufferedInputStream in = FileUtil.getInputStream("E:\\a\\1.txt");
        BufferedOutputStream out = FileUtil.getOutputStream("E:\\a1\\1.txt");
        long copySize = IoUtil.copy(in, out);
        System.out.println(copySize);
	}
}
