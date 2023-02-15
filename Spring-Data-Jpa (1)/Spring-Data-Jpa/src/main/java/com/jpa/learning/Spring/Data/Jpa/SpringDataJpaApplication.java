package com.jpa.learning.Spring.Data.Jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jpa.learning.Spring.Data.Jpa.Repo.StudentRepo;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandlinerunner(StudentRepo studentrepo){
//		return args ->{
//			Student sarvesh = new Student(
//					"Sarvesh",
//					"Dorve",
//					"sarveshdorve2001@gmail.com",
//					"Ashok Dorve",
//					"ad@gmail.com",
//					"8237346989"
//					);	
//			studentrepo.save(sarvesh);
//		};
//	}
}
