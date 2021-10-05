package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo") //No need for component scan if we are declaring Bean here
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() { //Here name of the method is used as Bean Id
		return new SadFortuneService();
	}
	
	//define bean for swim coach and inject dependency
	@Bean
	public SwimCoach swimCoach() {
		return new SwimCoach(sadFortuneService()); //Constructor Injection
	}

}
