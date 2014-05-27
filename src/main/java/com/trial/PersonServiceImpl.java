package com.trial;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonServiceImpl {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Map<String,Object>> getAllRecords(){
		
		//jdbcTemplate.execute("create table contacts (name varchar(45),email varchar(45),phone varchar(45))");
		//jdbcTemplate.execute("insert into contacts values ('Ganesh Ghag','gan@meail.com','2553434')");
		
		return jdbcTemplate.queryForList("SELECT * FROM trytable");
	}
	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("database-config.xml");
		String ret = ((PersonServiceImpl)context.getBean("personServiceImpl")).getAllRecords().toString();
		
		System.out.println(ret);
		
	}

}
