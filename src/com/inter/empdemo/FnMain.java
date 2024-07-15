package com.inter.empdemo;

import java.util.Scanner;

public class FnMain {
	public static void main(String[] args) {

		Employee employee = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Select the category to know their entire details");
		String option = sc.nextLine();

		switch (option.toUpperCase()) {
		case "MANAGER":
			employee = new Manager("Vaishu", "Analyst", 100000, 10);
			employee.printDetails();
			employee.calcBonus(5000);
			employee.showMenus();
			Manager manager = (Manager) employee;
			manager.showHobbies(new String[] { "Music", "ReadingBooks", "Problem Solving" });
			manager.showTypes();
			break;

		case "DEVELOPER":
			employee = new Developer("Varun", "JAVADev", 1000, "Senior");
			employee.printDetails();
			employee.calcBonus(500);
			employee.showMenus();

			Developer developer = (Developer) employee;
			developer.indoor();
			developer.outdoor();
			String[] result = developer.showSkills("Senior");
			for(String res : result)
			{
				System.err.println(res);
			}
			break;

		case "TESTER":
			employee = new Tester("Sai", "Devops", 1000, "Junior");
			employee.printDetails();
			employee.calcBonus(50);
			employee.showMenus();
			Tester tester = (Tester) employee;
			tester.showTypes();
			
			String[] projects= tester.showProjects("Junior");
			for(String project:projects)
			{
				System.out.println(project);
			}
			break;
		default:
			System.out.println("Invalid employee type");
			System.exit(0);

		}

	}

}
