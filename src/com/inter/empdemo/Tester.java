package com.inter.empdemo;

public class Tester extends Employee implements Entertainment {

	String designation;
	
	public Tester(String empName, String department, double salary, String designation) {
		super(empName, department, salary);
		this.designation = designation;
	}

	@Override
	void calcBonus(int amount) {
		salary=(salary*amount)/0.5;
		System.out.println("Bonus for Tester"+salary);

	}
	
	public String[] showProjects(String designation)
	{
		if(designation.equalsIgnoreCase("Senior"))
		{
			return new String[] {"TCS","INFOSYS","CITI","L&T"};
		}
		else if(designation.equalsIgnoreCase("Junior"))
		{
			return new String[] {"TCS","INFOSYS"};
		}
		else if(designation.equalsIgnoreCase("DEV1"))
		{
			return new String[] {"US"};
		}
		
		return null;
	}

	@Override
	public void showTypes() {
		System.out.println("Entertainment for Tester:");
		System.out.println("1.Conference");
		System.out.println("2.Onedayout");
		System.out.println("3.Party");
		
	}

}
