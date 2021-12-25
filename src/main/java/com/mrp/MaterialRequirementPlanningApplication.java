package com.mrp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.mrp.system")
@SpringBootApplication
public class MaterialRequirementPlanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaterialRequirementPlanningApplication.class, args);
	}

}
