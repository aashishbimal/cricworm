package com.cricworm.cricworm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cricworm.cricworm.repo.BookRepository;

@SpringBootApplication
public class CricwormApplication implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CricwormApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepository.playWithEM();
	}

}
