package aplication;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		CurrencyConverter.dollarBought = sc.nextDouble();
		
		System.out.println("Amout to be paid in reais = " + String.format("%.2f", CurrencyConverter.amount()));
		
		sc.close();
	}

}
