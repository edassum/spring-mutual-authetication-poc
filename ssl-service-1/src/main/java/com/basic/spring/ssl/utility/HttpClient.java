package com.basic.spring.ssl.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpClient implements CommandLineRunner {


	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) {
		System.out.println("Inside run method from service -1");
	//	ResponseEntity<String> response = template.getForEntity("https://localhost:8443/simple",String.class);
	//	System.out.println(response.getBody());
		System.out.println("Just printing");
	}

}
