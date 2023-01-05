package com.courseapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.app.service.CourseService;
//annotated with springbootapplication=@configuration enable auto configuration @componentscan
@SpringBootApplication
@ComponentScan("com")
public class SpringStandaloneAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringStandaloneAppApplication.class, args);
	}
	@Autowired
	CourseService courseService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		courseService.getCourses().forEach(System.out::println);
		
		
	}

}

