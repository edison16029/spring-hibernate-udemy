package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println("My today's fortune : " +  theCoach.getDailyFortune());
		
		//call the methods to show field injection
		System.out.println("Email: " +  theCoach.getEmail());
		System.out.println("Email: " +  theCoach.getTeam());
		
		context.close();

	}

}
