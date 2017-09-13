package tutorial;

import java.util.Scanner;

public class DemoRaise {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double salary;
		double startingWage;
		
		
		System.out.println("Enter employee salary >> ");
		salary = input.nextDouble();
		System.out.println("Enter starting wage >> ");
		startingWage = input.nextDouble();
		predictRaise(salary);
		predictRaise(startingWage);
	
	}

	public static void predictRaise(double salary) 
	{
	double newSalary;
	final double RAISE_RATE = 1.10;
	newSalary = salary * RAISE_RATE;
	System.out.println("Current salary: " +
	salary + "   After raise: " + newSalary);
	
	}
	

	
}

