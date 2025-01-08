package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Entities.enuns.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("-----------------------------------------------");
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Birth date(DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("-----------------------------------------------");
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String orderStatus = sc.next();
		
		Order order = new Order(new Date(), client, OrderStatus.valueOf(orderStatus));
		
		System.out.println("-----------------------------------------------");
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			
			System.out.println("Enter #"+(1+i)+" item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int qtd = sc.nextInt();
			System.out.println("-----------------------------------------------");
			
			OrderItem orderItem = new OrderItem(qtd, productPrice, new Product(productName, productPrice));
			order.addItem(orderItem);//paa adicionar os intens na lista
		}
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println("");
		System.out.println(order);
		
		sc.close();
	}

}
