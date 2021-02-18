package com.rj.bd.aio;
/**
 * @desc   客户端
 * @author LYP
 * @time   2021-02-15
 */
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Scanner;

import cn.hutool.core.io.BufferUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.StrUtil;
import cn.hutool.socket.aio.AioClient;
import cn.hutool.socket.aio.AioSession;
import cn.hutool.socket.aio.SimpleIoAction;
import cn.hutool.socket.nio.NioClient;

public class Client {
		public static void main(String[] args) {
			AioClient client = new AioClient(new InetSocketAddress("localhost", 8899), new SimpleIoAction() {
				
				@Override
				public void doAction(AioSession session, ByteBuffer data) {
					if (data.hasRemaining()) {
						Console.log(StrUtil.utf8Str(data));
						session.read();
					}
					Console.log("OK");
				}
			});
			
			client.write(ByteBuffer.wrap("Hello".getBytes()));
			client.read();
			
			client.close();
		}

	
}
