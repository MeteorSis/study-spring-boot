package com.example.groovy_test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class GroovyTestApplication {

	static void main(String[] args) {
		SpringApplication.run(GroovyTestApplication, args)
	}

}

@RestController
class HelloController {
	@GetMapping("/")
	def hello() {
		return "Hello Spring Boot"
	}
}
