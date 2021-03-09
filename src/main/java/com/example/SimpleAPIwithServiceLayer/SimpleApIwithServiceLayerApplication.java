package com.example.SimpleAPIwithServiceLayer;

import com.example.SimpleAPIwithServiceLayer.Employee.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class SimpleApIwithServiceLayerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SimpleApIwithServiceLayerApplication.class, args);
	}
}
