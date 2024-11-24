package Utilities;

public class Converter {
	
	public static String CurrencyConverter(double quantity, double dollar) {
		double result = (quantity * dollar);
		return String.format("%.2f", result = result + (result * 0.06));
	}
	
}
