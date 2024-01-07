package com.example.oop;

import com.example.oop.LawOfDemeter.LawOfDemeter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OopApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		OopExample oopExample = new LawOfDemeter();
		oopExample.run();
	}
}
