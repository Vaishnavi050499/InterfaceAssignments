package com.inter.functional;

public class CourseMain {

	public static void main(String[] args) {
	
		ICourse course=()-> new String[]{"HTML","CSS","Javascript"};
		String[] courses=course.showCorses();
		System.out.println("Course 1:");
		for(String sub:courses)
			System.out.print(sub+" ");
		System.out.println();
		course=()-> new String[]{"MYSQL","mongodb"};
		System.out.println("Course 2:");
		courses=course.showCorses();
		for(String sub:courses)
			System.out.print(sub+" ");
		System.out.println();
		course=()-> new String[]{"Java","Spring"};
		System.out.println("Course 3:");
		courses=course.showCorses();
		for(String sub:courses)
			System.out.print(sub+" ");
		
		}

	}


