package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DelgadosTacos {

	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("0.00");
		menu();
	}

	public static void menu()
	{
		Scanner input = new Scanner(System.in);
		double tacoPrice = 1.99;
		double burritoPrice = 2.99;
		double enchiladaPrice = 2.99;
		double posoleStewPrice = 2.50;
		double guacChips = 1.99;
		double quesadillas = 2.99;
		double nachosPrice = 2.50;
		double Tamales = 2.50;
		double ricePuddingPrice = 1.50;
		double vampTacoPrice = 3.99;
		
		double tacoAmountOrdered;
		double burritoAmountOrdered;
		double enchiladaAmountOrdered;
		double posoleAmountOrdered;
		double guacAmountOrdered;
		double quesadillasAmountOrdered;
		double nachosAmountOrdered;
		double tamalesAmountOrdered;
		double riceAmountOrdered;
		double vampAmountOrdered;
		
		double totalPrice;
		
		double tacoPriceTotal;
		double burritoPriceTotal;
		double enchiladaPriceTotal;
		double posolePriceTotal;
		double guacPriceTotal;
		double quesadillasPriceTotal;
		double nachosPriceTotal;
		double tamalesPriceTotal;
		double ricePriceTotal;
		double vampPriceTotal;
		
		System.out.println("How many tacos do you want?>>>> ");
		tacoAmountOrdered = input.nextDouble();
		System.out.println("How many burritos do you want>>>> ");
		burritoAmountOrdered = input.nextDouble();
		System.out.println("How many enchiladas do you want>>>> ");
		enchiladaAmountOrdered = input.nextDouble();
		System.out.println("How many posole soups do you want>>>> ");
		posoleAmountOrdered = input.nextDouble();
		System.out.println("How many guacamole and chips do you want?>>>> ");
		guacAmountOrdered = input.nextDouble();
		System.out.println("How many quesadillas do you want?>>>> ");
		quesadillasAmountOrdered = input.nextDouble();
		System.out.println("How many nachos do you want?>>>> ");
		nachosAmountOrdered = input.nextDouble();
		System.out.println("How many tamales do you want?>>>> ");
		tamalesAmountOrdered = input.nextDouble();
		System.out.println("How many rice puddings do you want?>>>> ");
		riceAmountOrdered = input.nextDouble();
		System.out.println("How many vampire tacos do you want?>>>> ");
		vampAmountOrdered = input.nextDouble();
		
		
		tacoPriceTotal = tacoAmountOrdered * tacoPrice;
	    burritoPriceTotal = burritoAmountOrdered * burritoPrice;
	    enchiladaPriceTotal = enchiladaAmountOrdered * enchiladaPrice;
	    posolePriceTotal = posoleAmountOrdered * posoleStewPrice;
	    guacPriceTotal;
	    totalPrice = tacoPriceTotal + burritoPriceTotal + enchiladaPriceTotal + posolePriceTotal;
	    
	    System.out.println("You ordered " + tacoAmountOrdered + " and " + burritoAmountOrdered + " it will cost $" 
	    		+ totalPrice);
	}

	public static void salesTax()
	{
		final double TAX_RATE = .60;
		
		menu();
	}
	
	
	public static void tacoTruck()
	{
		
	}
	
}
