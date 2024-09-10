package org.tech.AutoWriting;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class EmployeeCom {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("EmpConstructor.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		CompanyApp cp=(CompanyApp)bf.getBean("c");
		cp.show();
	}

}
