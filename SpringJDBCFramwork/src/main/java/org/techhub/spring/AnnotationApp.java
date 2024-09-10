package org.techhub.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AnnotationApp {
@Bean(name="dataSource")
public DriverManagerDataSource getDataSource() {
	DriverManagerDataSource datasource=new DriverManagerDataSource();
	datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	datasource.setUsername("root");
	datasource.setPassword("1234");
	datasource.setUrl("jdbc:mysql://localhost:3306/pdf");
	return datasource;
	
}
@Bean(name="template")
public JdbcTemplate getTemplate() {
	JdbcTemplate template=new JdbcTemplate();
	template.setDataSource(getDataSource());
	return template;

}
}
