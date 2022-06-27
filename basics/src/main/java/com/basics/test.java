package com.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		employee e = (employee) context.getBean("u1");
		System.out.println(e);

	}

}
