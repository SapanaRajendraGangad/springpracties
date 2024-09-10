package org.techhub.spring;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class dmDemo {
public static void main(String x[]) {
Resource r=new ClassPathResource("dm.xml");
BeanFactory bf=new XmlBeanFactory(r);
DriverManagerDataSource d=(DriverManagerDataSource)bf.getBean("conn");
if(d!=null) {
	System.out.println("DataBase Is Connected");
}
else {
	System.out.println("DataBase is not Connected");
}
}
}
