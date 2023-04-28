package com.telusko.SpringAnnotationConfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary  // here we mentioned primary so code take this MediaTeak object not Sanpdragon, if you don't want to use this annotation then we need to use Qualifier annotation in Samsung class
public class MediaTek implements MobileProcesser 
{
	public void processer() {
		System.out.println("Worlds 2nd CPU");
	}

}
