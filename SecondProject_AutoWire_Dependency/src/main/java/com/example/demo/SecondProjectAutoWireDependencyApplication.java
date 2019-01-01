package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecondProjectAutoWireDependencyApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//SpringApplication.run(SecondProjectAutoWireDependencyApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(SecondProjectAutoWireDependencyApplication.class, args);
		Alien a = context.getBean(Alien.class);
		a.show();
		
		Alien a1 = context.getBean(Alien.class);
		a1.show();
		
		}
}
