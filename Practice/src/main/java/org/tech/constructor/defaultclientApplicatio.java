package org.tech.constructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class defaultclientApplicatio {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("constructor.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Defaultconst dc=(Defaultconst)bf.getBean("t");
		
		
	}

}
