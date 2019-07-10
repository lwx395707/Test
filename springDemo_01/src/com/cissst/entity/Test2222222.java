package com.cissst.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2222222 {
	public static void main(String[] args) {
		BeanFactory bean = new ClassPathXmlApplicationContext("applicationContext.xml");
		User users = (User) bean.getBean("users");
		users.setPassword("111");
		System.out.println(users.getPassword());
	}
}
