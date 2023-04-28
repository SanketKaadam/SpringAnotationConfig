package com.telusko.SpringAnnotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.telusko.SpringAnnotationConfig")
public class AppConfig {
	
//	@Bean
//	public Samsung getPhone()
//	{
//		return new Samsung();
//	}
//	
//	@Bean
//	public MobileProcesser getProcesser() 
//	{
//		return new Snapdragon();
//	}

}
