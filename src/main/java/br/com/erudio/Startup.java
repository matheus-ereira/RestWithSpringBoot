package br.com.erudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Startup {

	public static void main(String[] args) {
		try {
			SpringApplication.run(Startup.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
