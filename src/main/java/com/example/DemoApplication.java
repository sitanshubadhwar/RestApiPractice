package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.Student;
import com.example.repository.EmployeeRepository;

@SpringBootApplication
public class DemoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

//test
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(EmployeeRepository employeeRepository) {
		return (args) -> {
			employeeRepository.save(new Student("Gustavo", "Ponce", true));
			employeeRepository.save(new Student("John", "Smith", true));
			employeeRepository.save(new Student("Jim ", "Morrison", false));
			employeeRepository.save(new Student("David", "Gilmour", true));
			logger.info("The sample data has been generated");
		};
	}
}
