package Application;

import java.util.Locale;
import java.util.Scanner;

import Utilities.Converter;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double qtd = sc.nextDouble();
		
		String result = Converter.CurrencyConverter(qtd, dollar);
		
		System.out.print("Amount to be paid in reais = "+result);
		
		sc.close();
	}

}
