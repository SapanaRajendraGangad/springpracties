package org.tech;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class clientaplication {
public static  void main(String []args) {

	Resource r=new ClassPathResource("demo.xml");

	BeanFactory bf=new XmlBeanFactory(r);
	Object obj=bf.getBean("e");
	Employee e=(Employee)obj;
	e.show();
}
}
