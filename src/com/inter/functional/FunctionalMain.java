package com.inter.functional;

public class FunctionalMain {
	public static void main(String[] args) {

		Calculator calculator= (x,y)->System.out.println("Additon"+" "+(x+y));
		calculator.calculate(10, 20);	
		
		calculator=(x,y)->System.out.println("Difference"+" "+(x-y));
		calculator.calculate(200, 100);	
		
		calculator=(x,y)->System.out.println("Product"+" "+(x*y));
		calculator.calculate(20, 100);	
		
		calculator=(x,y)->System.out.println("Division"+" "+(x/y));
		calculator.calculate(200, 100);	
		
			

		
	}
}
