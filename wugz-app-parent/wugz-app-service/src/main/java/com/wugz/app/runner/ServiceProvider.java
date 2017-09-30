package com.wugz.app.runner;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

public class ServiceProvider {
	/**
	 * 启动类
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		try{
			Properties p = new Properties();
			p.load(ServiceProvider.class.getResourceAsStream("/config/log4j.properties"));
			PropertyConfigurator.configure(p);
		}catch (Exception e) {
			System.out.println("Log4j加载异常");
		}
		args = new String[]{"spring","myjetty"};
		com.alibaba.dubbo.container.Main.main(args);
	}
}
