package com.basic.spring.ssl.util;

import java.io.File;

import org.springframework.stereotype.Component;

@Component
public class KeysUtil {

	public File loadkeyFile(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		File privKeyFile = new File(classLoader.getResource(fileName).getFile());
		return privKeyFile;
	}
}
