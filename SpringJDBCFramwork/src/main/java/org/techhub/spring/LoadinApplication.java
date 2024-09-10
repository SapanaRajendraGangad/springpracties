package org.techhub.spring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
public class LoadinApplication {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("text.xml");
		BeanFactory bf=new XmlBeanFactory(r);
//		DriverManagerDataSource d=(DriverManagerDataSource)bf.getBean("test");
//		if(d!=null) {
//			System.out.println("DataSourse is connected");
//		}
//		else {
//			System.out.println("Database is not Connected");
//		}
		JdbcTemplate template=(JdbcTemplate)bf.getBean("template");
		template.execute("insert into emp values (10,'hgjg','dsa@gmail.com','757555543',87585)");
		System.out.println("sucess....");
	}

}
