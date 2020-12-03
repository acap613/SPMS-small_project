package com.revature.spms;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpmsApplication.class, args);
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
