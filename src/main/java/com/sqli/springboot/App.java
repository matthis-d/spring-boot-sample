package com.sqli.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class App 
{
	/**
	 * Main function to start my app
	 * @param args Arguments given on launch
	 * @throws Exception If something bad happens
	 */
    public static void main(String[] args) throws Exception {
        
    	SpringApplication.run(App.class, args);
    	
    	System.out.println("Hello Spring Boot!");
    }
}
