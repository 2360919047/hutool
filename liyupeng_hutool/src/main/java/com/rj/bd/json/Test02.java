package com.rj.bd.json;

import java.util.HashMap;

import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;

/**
 * @desc   XML转JSON
 * @author LYP
 * @time   2021-02-15
 */
public class Test02 {
	public static void main01(String[] args) {
        String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<DayFlowInfoQryReq>\n" +
                "    <IDType>12</IDType>\n" +
                "    <IDItemRange>13567895432</IDItemRange>\n" +
                "    <BizType>01</BizType>\n" +
                "    <POCont>\n" +
                "        <BooleanTest>true</BooleanTest>\n" +
                "        <OprTime>20210103161025</OprTime>\n" +
                "    </POCont>\n" +
                "    <IdentCode>3240ad5b9b43a</IdentCode>\n" +
                "</DayFlowInfoQryReq>";
        String jsonStr = JSONUtil.xmlToJson(xmlStr).toStringPretty();
        System.out.println(jsonStr);
    }
	
	//返回文件大小
	public static void main(String[] args) {
        String fileUrl = "http://learning.happymmall.com/nginx/linux-nginx-1.10.2.tar.gz";
        //将文件下载后保存在E盘的new目录想，返回结果为下载文件的大小
        long size = HttpUtil.downloadFile(fileUrl, FileUtil.file("E:\\a"));
        System.out.println("size: " + size);//size: 910812
        
        String strSize = FileUtil.readableFileSize(size);
        System.out.println("readableFileSize: " + strSize);//readableFileSize: 889.46 kB
    }
}
