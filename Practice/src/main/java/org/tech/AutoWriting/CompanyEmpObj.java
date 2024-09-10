package org.tech.AutoWriting;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class CompanyEmpObj {

	public static void main(String[] args) {
	Resource r=new ClassPathResource("CompanyEmp.xml");
	BeanFactory bf=new XmlBeanFactory(r);
	Company cm=(Company)bf.getBean("c");
	cm.show();
	}

}
