package com.mathiric.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication({"com.mathiric.house.beans"})
@ComponentScan("com.mathiric.house.beans")
public class HouseApplication {

	public static void main(String[] args) {

		SpringApplication.run(HouseApplication.class, args);
	}

}
