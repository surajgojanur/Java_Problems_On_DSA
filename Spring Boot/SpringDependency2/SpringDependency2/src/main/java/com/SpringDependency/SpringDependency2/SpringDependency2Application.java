package com.SpringDependency.SpringDependency2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependency2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDependency2Application.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}


}

