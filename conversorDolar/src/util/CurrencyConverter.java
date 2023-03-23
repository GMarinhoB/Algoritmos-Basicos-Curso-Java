package util;

public class CurrencyConverter {

	public static double dollarPrice;
	public static final double IOF = 0.06;
	public static double dollarBought;
	private static double aux;
	
	public static double amount() {
		aux = dollarPrice*dollarBought;
		return aux + (aux*IOF);
	}

}
