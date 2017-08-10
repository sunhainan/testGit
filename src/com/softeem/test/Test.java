package com.softeem.test;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.softeem.service.impl.StudentServiceImpl;

public class Test {

	public static void main(String[] args) {
		//1.����Spring�����ļ�
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		//2.��ȡSpring�Ķ��󹤳�
		ConfigurableBeanFactory factory = new XmlBeanFactory(resource);
		//3.��ȡbean����
		Object obj = factory.getBean("student");
		System.out.println(obj);	
		Object obj1 = factory.getBean("stuService");
		StudentServiceImpl service = (StudentServiceImpl) obj1;
		service.save(null);
		
	}
}
