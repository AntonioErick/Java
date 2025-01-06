package Application;

import java.util.Locale;
import java.util.Scanner;

import Utilities.Products;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Products product = new Products();
		
		System.out.println("ENTER PRODUCT DATA");
		System.out.println("Name: ");
		product.name = sc.next();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity: ");
		product.quantity = sc.nextInt();
		
	
		System.out.println(product.toString());
		System.out.println(" ");
		
		System.out.println("Enter the number of product to be added in stock: ");
		int quantity = sc.nextInt();
		
		product.AddProducts(quantity);
		
		System.out.println(product.toString());
		System.out.println(" ");
		
		System.out.println("Enter the number of product to be removed in stock: ");
		quantity = sc.nextInt();
		
		product.RemoveProducts(quantity);
		
		System.out.println(product.toString());
		System.out.println(" ");
		
		sc.close();
	}

}
