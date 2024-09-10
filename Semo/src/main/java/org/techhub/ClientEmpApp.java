package org.techhub;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource; 
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
public class ClientEmpApp {

	public static void main(String[] args) {
	Resource r=new ClassPathResource("test.xml");
	BeanFactory bf=new XmlBeanFactory(r);
	Object obj=bf.getBean("e");
	EMployeeApp e=(EMployeeApp)obj;
	e.show();
	}

}
