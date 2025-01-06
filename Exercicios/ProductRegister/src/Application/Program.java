package Application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

import Utilities.Products;

public class Program {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		String name;
		double price = 0;
		double sum = 0;
		double average = 0;
		
		System.out.println("_______________________________________________________");
		System.out.print("Enter the quantity of products you wanto to register: ");
		int n = sc.nextInt();
		
		Products[] product = new Products[n];
		
		for (int i = 0; i<product.length;i++) {
			System.out.println("-------------------------------------------------------");
			sc.nextLine();
			System.out.print("Enter the "+(i+1)+"º product name: ");
			name = sc.nextLine();
			System.out.print("Enter the "+(i+1)+"º product price: ");
			price = sc.nextDouble();
			
			product[i] = new Products(name, price);
		}
	
		System.out.println("_______________________________________________________");
		for (int i = 0; i<product.length;i++) {
			System.out.println((i+1)+"º Product: ");
			System.out.print("Name: "+ product[i].getName());
			System.out.printf(", Price: $ %.2f%n", product[i].getPrice());
		} 
		
		for (int i = 0; i<product.length;i++) {
			sum += product[i].getPrice();
		}
		
		average += sum;
		
		System.out.println("-------------------------------------------------------");
		System.out.printf("AVERAGE PRICE: $ %.2f%n", average);
		System.out.println("_______________________________________________________");
		
		sc.close();
	}
	
}
