package com.masai.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages= {"com.masai.app"})
@PropertySource("db.properties")
public class AppConfig {
	


		@Bean
		public String getValue()
		{
			return "Hello World";
		}
		
		@Bean
		public Travel travel()
		{
			Travel trav=new Travel();
			trav.setTravelid(123);
			trav.setName("Shyam Ranjan Bharti");
			trav.setBike(bike());
			trav.setCar(car());
			return trav;
		}
		
		@Bean
		public Bike bike()
		{
			Bike bik=new Bike();
			bik.setBikeno(6578);
			bik.setBikename("Suzuki");
			return bik;
		}
		@Bean
		public Car car()
		{
		Car cr=new Car(1225,"scorpio");
		return cr;
		}
		

}
