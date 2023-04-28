package com.telusko.SpringAnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcesser 
{
	public void processer() {
		System.out.println("Worlds best CPU");
	}
}
