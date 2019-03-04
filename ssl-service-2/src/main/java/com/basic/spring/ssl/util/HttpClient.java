/**
 * 
 */
package com.basic.spring.ssl.util;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpClient implements CommandLineRunner {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	KeysUtil keysUtil;

	@Override
	public void run(String... args) throws Exception {
		String filename= "key.pem";
		File loadkeyFile = keysUtil.loadkeyFile(filename);
		
		System.out.println(loadkeyFile);
	//	ResponseEntity<String> response = template.getForEntity("http://localhost:8080/hello",String.class);
	//	System.out.println(response.getBody());
		System.out.println("Hello");
	}
}
