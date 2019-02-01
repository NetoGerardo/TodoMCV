package com.todomvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



//public class TodoMcvApplication {
@SpringBootApplication
public class TodoMcvApplication extends SpringBootServletInitializer{
	
	//COMENTAR PARA VOLTAR AO NORMAL
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TodoMcvApplication.class);
	}
	//

	public static void main(String[] args) {
		SpringApplication.run(TodoMcvApplication.class, args);
	}

}

