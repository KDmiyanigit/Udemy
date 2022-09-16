package com.Udemy.Udemy;


import com.Udemy.Udemy.basics.Learning;
import com.Udemy.Udemy.javaTPoint.ControleStatment;
import org.apache.naming.java.javaURLContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdemyApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyApplication.class, args);

		ControleStatment c = new ControleStatment();
		c.isElse();
		c.terNaryOperater();
	}




}