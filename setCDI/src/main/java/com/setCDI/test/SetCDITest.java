package com.setCDI.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.setCDI.beans.Office;

public class SetCDITest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource ("com/setCDI/common/application-context.xml"));
		Office office = beanFactory.getBean("office",Office.class);
		System.out.println(office);
	}

}
