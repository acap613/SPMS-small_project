package com.revature.spms.main;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpmsMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpmsMainApplication.class, args);
	}
	
	@Bean
	public DataSource getDataSource() {
		return DataSourceBuilder.create()
				.url("jdbc:oracle:thin:@localhost:1521/orcl")
				.username("c##angelo")
				.password("admin")
				.build();
	}

}
