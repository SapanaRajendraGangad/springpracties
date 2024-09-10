package org.tech;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class productControllerApp {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("test.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		product p=(product)bf.getBean("e");
		
		System.out.println(p);
	}

}
