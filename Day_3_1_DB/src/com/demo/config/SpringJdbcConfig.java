package com.demo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

@Configuration
@ComponentScan("com.demo")
public class SpringJdbcConfig {
		@Bean
		public DataSource getDataSource(){
			DriverManagerDataSource dataSource =new DriverManagerDataSource();
			dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			dataSource.setUsername("fsdm24_1");
			dataSource.setPassword("fsdm24_1");
			return dataSource;
		}
		@Bean
		public JdbcTemplate getJdbcTemplate(){
			JdbcTemplate jdbcTemplate = new JdbcTemplate();
			jdbcTemplate.setDataSource(getDataSource());
			return jdbcTemplate;
		}
		
		
		public EmployeeDao getEmployeeDAO(){
			EmployeeDaoImpl empDao= new EmployeeDaoImpl();
			empDao.setJdbcTemplate(getJdbcTemplate());
			return empDao;
		}
	
}
