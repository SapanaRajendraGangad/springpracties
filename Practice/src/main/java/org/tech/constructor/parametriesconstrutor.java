package org.tech.constructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class parametriesconstrutor {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("constructor.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		parametriesconst pc=(parametriesconst)bf.getBean("r");
		
	}

}
