package exercises;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) 
	{
		computePercent(Num1, Num2);

	}

	public static void computePercent(double totalPercent)
	{
		Scanner input = new Scanner(System.in);
		double Num1;
		double Num2;
		double totalPercent;

		
		System.out.println("Enter a number >> ");
		Num1 = input.nextDouble();
		System.out.println("Enter another numer >> ");
		Num2 = input.nextDouble();
		
		totalPercent = (Num1 * 100) / Num2;
		
		System.out.println(+ Num1 + " is " + totalPercent + " percent of " + Num2);
	}
	
}
