package Application;

import java.util.Locale;
import java.util.Scanner;

import Utilities.Numbers;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int numbers = 0;
		
		System.out.println("Enter the quantity of numbers that you want to register: (max 10): ");
		int n = sc.nextInt();
		
		if (n > 10 || n < 0) {
			System.out.println("Maximum number exceeded");
		}
		else {
			Numbers[] number = new Numbers[n];
			System.out.println("______________________________________________");
			System.out.println("Enter numbers:");
			for(int i=0; i<n; i++) {
				numbers = sc.nextInt();
				
				number[i] = new Numbers(numbers);
			}
			
			System.out.println("______________________________________________");
			System.out.println("Negative numbers entered: ");
			for(int i = 0; i<number.length; i++) {
				if (number[i].getNumber() < 0) {
					System.out.println(number[i].getNumber());
				}
			}
		}
		
		sc.close();
	}
}

