package com.telusko.SpringAnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Samsung S7 = (Samsung) factory.getBean(Samsung.class);
    	S7.config();
    }
}
