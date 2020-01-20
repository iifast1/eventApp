package com.tt.eventApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.ViewResolver;
@SpringBootApplication
public class EventAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventAppApplication.class, args);
	}

	
		/*@Bean
	public ViewResolver getViewResolver(){
		InternationalResourceViewResolver resolver = new InternationalViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(jstlView.class);
		return resolver;
	}  */

	
	
	
}
