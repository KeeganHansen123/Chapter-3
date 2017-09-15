package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DelgadosTacos {

	public static void main(String[] args) 
	{
		menu();
		salesTax();
	}

	public static void menu()
	{
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		double tacoPrice = 1.99;
		double burritoPrice = 2.99;
		double enchiladaPrice = 2.99;
		double posoleStewPrice = 2.50;
		double guacChipsPrice = 1.99;
		double quesadillasPrice = 2.99;
		double nachosPrice = 2.50;
		double TamalesPrice = 2.50;
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
		double totalWithTax;
		
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
	    guacPriceTotal = guacAmountOrdered * guacChipsPrice;
	    quesadillasPriceTotal = quesadillasAmountOrdered * quesadillasPrice;
	    nachosPriceTotal = nachosAmountOrdered * nachosPrice;
	    tamalesPriceTotal = tamalesAmountOrdered * TamalesPrice;
	    ricePriceTotal = riceAmountOrdered * ricePuddingPrice;
	    vampPriceTotal = vampAmountOrdered * vampTacoPrice;
	    totalPrice = tacoPriceTotal + burritoPriceTotal + enchiladaPriceTotal + posolePriceTotal +
	    		guacPriceTotal + quesadillasPriceTotal + nachosPriceTotal + tamalesPriceTotal + ricePriceTotal + vampPriceTotal;
	    
	    System.out.println("It will cost $" + totalPrice);
	    System.out.println("Your total with tax comes to $" + (df.format(totalWithTax)));
	    totalWithTax = totalPrice
	
	}

	public static void salesTax()
	{
		double TAX_RATE = 0.075;
	    System.out.println("It will cost $" + totalPrice);
	    System.out.println("Your total with tax comes to $" + (df.format(totalWithTax)));
	    totalWithTax = totalPrice * TAX_RATE;
	}
	
	
	public static void tacoTruck()
	{
		
	}
	
}

//System.out.println("You ordered " + tacoAmountOrdered + " and " + burritoAmountOrdered + " and " + posoleAmountOrdered + 
		//" and " + guacAmountOrdered + " and " + nachosPriceTotal + 
		//" and " + tamalesPriceTotal + " and " + ricePriceTotal + " and " + ricePriceTotal + 
		//" and " + vampPriceTotal + " it will cost $" + totalPrice);
