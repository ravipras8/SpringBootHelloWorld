package com.sam.ravi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.sam.ravi"})
public class App 
{
    public static void main( String[] args )
    {
		SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
}
