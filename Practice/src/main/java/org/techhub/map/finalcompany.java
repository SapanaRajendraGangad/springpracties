package org.techhub.map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class finalcompany {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("listxm.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		company c=(company)bf.getBean("m");
		c.listshow();
	}

}
