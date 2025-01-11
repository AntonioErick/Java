package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Utilities.ImportedProduct;
import Utilities.Product;
import Utilities.UserProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("----------------------------------------------------------");
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("----------------------------------------------------------");
			System.out.println("Product #"+(i + 1)+" data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Custom fee: ");
				double customFee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, customFee));
			}
			else if(ch == 'u'){
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				
				list.add(new UserProduct(name, price, date));
			}
			else if(ch == 'c') {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.println("PRICE TAGS:");
		System.out.println();
		for(Product prd : list) {
			System.out.println(prd.priceTag());
		}
		
		System.out.println("----------------------------------------------------------");
		
		sc.close();
	}

}
