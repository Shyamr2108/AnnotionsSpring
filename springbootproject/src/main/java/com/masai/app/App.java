package com.masai.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
				
				Travel trav=ctx.getBean(Travel.class,"travel");
				trav.showDetails();
				
				PropertyExample ex=ctx.getBean(PropertyExample.class,"propertyExample");
				ex.displayInfo();
				
				AnnotationConfigApplicationContext actx=(AnnotationConfigApplicationContext)ctx;
				actx.close();
	}

}
