package Application;

import java.util.Locale;
import java.util.Scanner;

import Utilities.Product;
 
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter product data. ");
		System.out.println("Name: ");
		String name = sc.next();
		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		Product products = new Product(name, price);
		
		products.setName("Computer");
		System.out.println("Updated name: "+ products.getName());
		
		products.setPrice(3500);
		System.out.println("Updated price: "+ products.getPrice());
		
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
