package com.springboot.project.myFirstWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebAppApplication.class, args);
	}

}

/* Project Dependencies:
 * Spring Boot DevTools
 * Spring Web
 * datePicker 
 * Spring validation
 * tomcat-embed-jasper:provides support for .jsp file rendering
 * Bootstrap
 * Jquery:jQuery is a JavaScript library designed to simplify HTML DOM tree traversal and manipulation, as well as event handling, CSS animations, and Ajax.
 * For Database Connection:spring-boot-starter-data-jpa & h2database
 * */
