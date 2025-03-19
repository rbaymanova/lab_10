package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Factory<Person>  personFactory = new Factory<>();
		Person person = personFactory.create(Person.class);
		System.out.println(person);

		Factory<Student> studentFactory = new Factory<>();
		Student student = studentFactory.create(Student.class);
		System.out.println(student);
	}

}
