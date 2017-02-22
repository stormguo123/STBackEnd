package com.storm.backend.sysmanager.util;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServicePublisher {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-sysManager.xml");
		ctx.start();
		System.out.println("服务已启动");
		try{
			System.in.read();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	}
}
