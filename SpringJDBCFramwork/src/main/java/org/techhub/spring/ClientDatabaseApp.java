package org.techhub.spring;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class ClientDatabaseApp {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("Demo.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Scanner sc=new Scanner(System.in);
		JdbcTemplate template=(JdbcTemplate)bf.getBean("template");
		if(template!=null) {
			System.out.println("DataBase is Connected");
			System.out.println("enter the name");
			String name=sc.nextLine();
//			System.out.println("enter the email");
//			String email=sc.nextLine();
//			System.out.println("enter the contact");
//			String contact=sc.nextLine();
//			System.out.println("enter the salary");
//			String sal=sc.nextLine();
			System.out.println("enter the id");
			int id=sc.nextInt();
			PreparedStatementSetter pstmt=new PreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setInt(1, id);
					ps.setString(2, name);
				}
			};			
			template.update("update emp set id=? where name=?", pstmt);
			System.out.println("sucessss..........");
		}
		else {
			System.out.println("Database is not connected");
		}
	}

}
