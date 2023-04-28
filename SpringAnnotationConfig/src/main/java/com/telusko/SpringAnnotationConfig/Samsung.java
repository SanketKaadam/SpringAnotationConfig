package com.telusko.SpringAnnotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediaTek")
	private MobileProcesser cpu;


	public MobileProcesser getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcesser cpu) {
		this.cpu = cpu;
	}

	public void config() {
		
		System.out.println("Octa Core, 4GB Ram, 12MP camera");
		cpu.processer();
	}

}
