package org.techhub.spring;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class deleteemp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Resource r=new ClassPathResource("Del.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		JdbcTemplate template=(JdbcTemplate)bf.getBean("conn");
		if(template!=null) {
			System.out.println("enter the id which you wants to delete");
			int id=sc.nextInt();
			int value=template.update("delete from emp where id="+id);
		}
	}

}
