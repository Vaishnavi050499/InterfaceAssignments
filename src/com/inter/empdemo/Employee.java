package com.inter.empdemo;

public abstract class Employee implements Cafeteria {

	String empName;
	String department;
	double salary;
	
	
	public Employee(String empName, String department, double salary) {
		super();
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}

	abstract void calcBonus(int amount);
	
	public void printDetails()
	{
		System.out.println("Name"+empName);
		System.out.println("Department"+department);
		System.out.println("Salary"+salary);
	}

	@Override
	public void showMenus() {
		System.out.println("Menu for Employees");
		System.out.println("1.TEA");
		System.out.println("2.COFFEE");
		System.out.println("3.BUN");
		System.out.println("4.ICECREAM");
		
		
	}
	
	
}
