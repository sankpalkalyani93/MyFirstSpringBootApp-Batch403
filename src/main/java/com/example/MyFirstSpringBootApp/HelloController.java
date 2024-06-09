package com.example.MyFirstSpringBootApp;

import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	String message = null;
	Scanner scan = new Scanner(System.in);
	
	// as an endpoint which can be used over the localhost to display information
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello All, Welcome to Spring Boot.!";
	}
	
	@GetMapping("/message")
	public String displayUserMessage() {
		System.out.println("Enter your message : ");
		message = scan.nextLine();
		return message;
	}
}
