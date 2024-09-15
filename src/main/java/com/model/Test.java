package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
       Oracle o=(Oracle)ac.getBean("s");
	o.open();
	o.close();
	}

}
