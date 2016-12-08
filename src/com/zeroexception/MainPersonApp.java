package com.zeroexception;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPersonApp {
	public static void main(String... args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/zeroexception/BeansConstructor.xml");

		Person person = (Person) context.getBean("person");
		person.introduce();
	}
}
