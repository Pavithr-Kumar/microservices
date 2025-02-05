package com.zettamine.spring.ems;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
@PropertySource(value = {"dbconfig.properties"})
public class EmsConfig {
	@Bean
	@Autowired
	@Qualifier("dataSource")
	public JdbcTemplate getJdbcTemp(DataSource source) {
		JdbcTemplate template = new JdbcTemplate(source) ;
		return template;
		
	}
	
	
	@Bean(name = {"dataSource"})
	public DataSource getDataSource() throws IOException {
		//File file =new File("D:\\java-workspace\\spring\\spring-ems-annotaion\\src\\main\\resources\\dbconfig.properties");
		FileInputStream input = new FileInputStream("D:\\java-workspace\\spring\\spring-ems-annotaion\\src\\main\\resources\\dbconfig.properties");
		Properties prop = new Properties();
		prop.load(input);
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(prop.getProperty("driver"));
        dataSource.setUrl(prop.getProperty("url"));
        dataSource.setUsername(prop.getProperty("user"));
        dataSource.setPassword(prop.getProperty("pass"));
        return dataSource;
		
	}
	
	

}
