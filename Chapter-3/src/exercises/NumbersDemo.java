package exercises;

import java.util.Scanner;

public class NumbersDemo {

	public static void main(String[] args) 
	{
		
		
		
		displayTwiceTheNumber();
		displayNumberPlusFive();
		displayNumberSquared();
	}
	public static void displayTwiceTheNumber()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number you want doubled: ");
	    
	    int Num1 = input.nextInt();
	    System.out.println("Enter another number: ");
	    int Num2 = input.nextInt();
	    int times = Num1 * 2;
		int times2 = Num2 * 2;
	    System.out.println(+ Num1 + " times two is " + times + " and " + Num2 + " times two is " +
		times2);
	}
	public static void displayNumberPlusFive()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number that you want 5 added on to: ");
		int Num1 = input.nextInt();
		System.out.println("Enter another number: ");
		int Num2 = input.nextInt();
		
		int PlusFive = Num1 + 5;
		int PlusFive2 = Num2 + 5;
		
		System.out.println(+ Num1 + " plus 5 is " + PlusFive + " and " + Num2 +
				" plus 5 is " + PlusFive2);
	}
	public static void displayNumberSquared()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number you want squared: ");
		int Num1 = input.nextInt();
		System.out.println("Enter another number: ");
		int Num2 = input.nextInt();
		
		int Squared = Num1 * Num1;
		int Squared2 = Num2 * Num2;
		
		System.out.println(+ Num1 + " squared is " + Squared + " and " + Num2 +
				" squared is " + Squared2);
	}


}
