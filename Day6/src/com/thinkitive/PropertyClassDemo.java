package com.thinkitive;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyClassDemo {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileReader file = new FileReader("abc.txt");
		prop.load(file);
		System.out.println(prop.getProperty("name"));
	}
}
