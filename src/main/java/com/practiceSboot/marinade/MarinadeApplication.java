package com.practiceSboot.marinade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MarinadeApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MarinadeApplication.class, args);
		System.out.println(">>>>>>>>>>>>>>>>Starting app logic<<<<<<<<<<<<<<<");
		String[] beanList = applicationContext.getBeanDefinitionNames();
		Arrays.stream(beanList).forEach(v-> System.out.println(v));

	}

}
