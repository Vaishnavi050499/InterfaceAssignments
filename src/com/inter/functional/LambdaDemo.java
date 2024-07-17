package com.inter.functional;

import java.util.Scanner;

public class LambdaDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the username");
	String name=sc.nextLine();
	
	Validator validate = (username)->{
		String usernames[]=  {"Tom","Ronnie","John","Jack"};
		boolean found = false;
		for(String user :usernames)
		{
			if(username.equalsIgnoreCase(user))
			{
				found=true;
				break;
			}
		}
		if(found)
		{
			System.out.println("You are logged in successfully");
		}
		else {
			System.out.println("Invalid User");
		}
	};
	validate.validateUser(name);
}
}
