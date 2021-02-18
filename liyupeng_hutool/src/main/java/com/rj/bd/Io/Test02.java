package com.rj.bd.Io;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;

/**
 * @desc   使用FileReader类和FileWriter类进行文件的读写
 * @author LYP
 * @time   2021-02-15
 */
public class Test02 {
	public static void main(String[] args) {
		//默认UTF-8编码，可以在构造中传入第二个参数来自定义编码方式
        FileReader fileReader = new FileReader("E:\\a\\1.txt");
        String result = fileReader.readString();
        System.out.println(result);

        //默认UTF-8编码，可以在构造中传入第二个参数来自定义编码方式
        FileWriter writer = new FileWriter("E:\\a\\2.txt");
        String str = "test123测试使用sdfghj";
        writer.write(str);
	}
}
