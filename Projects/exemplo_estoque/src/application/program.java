package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		product products = new product();
		
		System.out.println("Enter product data. ");
		System.out.println("Name: ");
		products.name = sc.next();
		
		System.out.println("Price: ");
		products.price = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		products.quantity = sc.nextInt();
		
		System.out.println(" ");
		System.out.println("Product Data: "+ products);
		System.out.println(" ");
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		
		products.AddProducts(quantity);
		
		System.out.println(" ");
		System.out.println("Updated Data: "+ products);
		System.out.println(" ");
		
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		
		products.RemoveProduct(quantity);
		
		System.out.println(" ");
		System.out.println("Updated Data: "+ products);
		
		sc.close();
	}

}
