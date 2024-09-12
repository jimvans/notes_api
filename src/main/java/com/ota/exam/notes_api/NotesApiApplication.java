package com.ota.exam.notes_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
//@EnableWebMvc
//@ComponentScan({"com.ota.exam.notes_api"})
public class NotesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesApiApplication.class, args);
	}
}
