package Application;

import java.util.Locale;
import java.util.Scanner;

import Utilities.Numbers;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("How many numbers you will type? ");
		int n = sc.nextInt();
		
		Numbers[] number = new Numbers[n];
		
		for(int i = 0; i < number.length; i++) {
			System.out.print("Type a number: ");
			double numbers = sc.nextDouble();
			
			number[i] = new Numbers(numbers);
		}
		
		double sum = 0;
		double avg = 0;
		
		System.out.print("VALUE: ");
		for (int i = 0; i < number.length; i++) {
			System.out.printf("%.2f ", number[i].getNumbers());
		}
		
		for (int i = 0; i < number.length; i++) {
			sum += number[i].getNumbers();
		}
		
		avg = sum/n;
		
		System.out.printf("%nSum: %.2f%n", sum);
		System.out.printf("AVERAGE: %.2f%n", avg);
		
		sc.close();
	}

}
