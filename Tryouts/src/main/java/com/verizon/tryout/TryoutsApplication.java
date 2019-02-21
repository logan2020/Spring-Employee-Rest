package com.verizon.tryout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.verizon.employee.repo")
@ComponentScan(basePackages="com.verizon")
@EntityScan(basePackages="com.verizon.employee.entities")
public class TryoutsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryoutsApplication.class, args);
	}

}

