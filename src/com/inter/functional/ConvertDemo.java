package com.inter.functional;

import java.util.Scanner;

public class ConvertDemo {
	public static void main(String[] args) {

		FileConverter converter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the filename for converting");
		String name = sc.nextLine();

		String ext = getExtension(name);
		switch (ext.toUpperCase()) {
		case "ZIP":
			converter = () -> System.out.println("Converterted to zip");
			converter.convertFile();
			break;

		case "JAR":
			converter = () -> System.out.println("Converterted to JAR");
			converter.convertFile();
			break;

		case "WAR":
			converter = () -> System.out.println("Converterted to WAR");
			converter.convertFile();
			break;

		default:
			System.out.println("Invalid file format");
			System.exit(0);

		}

	}

	public static String getExtension(String name) {
		int input = name.lastIndexOf(".");
		String output = "";
		if (input != -1 && input < name.length()) {
			output = name.substring(input + 1);
		}
		return output;

	}
}
