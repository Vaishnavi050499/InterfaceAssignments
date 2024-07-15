package com.inter.empdemo;

public class Manager extends Employee implements Entertainment{

	
	int experience;
	
	
	public Manager(String empName, String department, double salary, int experience) {
		super(empName, department, salary);
		this.experience = experience;
	}


	@Override
	void calcBonus(int amount) {
		salary = salary+amount;
		System.out.println("Bonus for Manager"+salary);

	}
	
	void showHobbies(String[] hobbies)
	{   
		System.out.println("Hobbies of Manager");
		for(String hobby:hobbies)
		{
			System.out.println(hobby);
		}
	}


	@Override
	public void showTypes() {
		System.out.println("Entertainment for Managers:");
		System.out.println("1.Movies");
		System.out.println("2.Resort");
		System.out.println("3.Party");
		
		
	}

}
