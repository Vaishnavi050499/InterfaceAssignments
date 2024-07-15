package com.inter.empdemo;

public class Developer extends Employee implements Games{

	
	String designation; //senior,junior
	
	public Developer(String empName, String department, double salary, String designation) {
		super(empName, department, salary);
		this.designation = designation;
	}

	@Override
	void calcBonus(int amount) {
		salary = salary+(amount*0.5);
		System.out.println("Bonus for Developer" + salary);

	}
	public String[] showSkills(String designation)
	{
		if(designation.equalsIgnoreCase("Senior"))
		{
			return new String[]{"JAVA","SPRING","SPRINGBOOT","AWS"};
		}
		else if(designation.equalsIgnoreCase("Junior"))
		{
			return new String[] {"JAVA","SPRING"};
		}
		else if(designation.equalsIgnoreCase("DEV1"))
		{
			return new String[] {"JAVA"};
		}
		
		return null;
		}

	@Override
	public void indoor() {
		System.out.println("Indoor games available for developers are:");
		System.out.println("1.chess");
		System.out.println("2.Carrom");
		System.out.println("3.Badminton");
		System.out.println("4.Cards");
		
	}

	@Override
	public void outdoor() {
		System.out.println("outdoor games available for developers are:");
		System.out.println("1.cricket");
		System.out.println("2.football");
		System.out.println("3.handball");
		
		
	}
	}


