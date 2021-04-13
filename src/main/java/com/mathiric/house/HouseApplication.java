package com.mathiric.house;

//import com.mathiric.house.controller.HouseController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan("com.mathiric.house.domain")
//@SpringBootApplication("com.mathiric.house.domain")
@SpringBootApplication
public class HouseApplication {

	public static void main(String[] args) {

		SpringApplication.run(HouseApplication.class, args);
	}

}
