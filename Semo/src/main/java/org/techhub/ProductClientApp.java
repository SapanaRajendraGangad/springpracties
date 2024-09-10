package org.techhub;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource; 
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
public class ProductClientApp {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("pull.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		ProductApp p=(ProductApp)bf.getBean("p");
		
		System.out.println(p);
	}

}
