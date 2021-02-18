package com.rj.bd.mail;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;

public class Test {
	public static void main(String[] args) {
		MailAccount account = new MailAccount();
        account.setHost("smtp.qq.com");
        account.setPort(25);
        account.setAuth(true);
        account.setFrom("2360919047@qq.com");
        account.setUser("2360919047@qq.com");
        account.setPass("bquocvjpyammeche"); //密码
        MailUtil.send(account, CollUtil.newArrayList("2360919047@qq.com"), "主题", "内容", false);
	}
}
