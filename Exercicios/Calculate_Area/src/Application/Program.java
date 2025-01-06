package Application;

import java.util.Locale;
import java.util.Scanner;

import Utilities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width: ");
		rectangle.width = sc.nextDouble();
		System.out.println("Enter rectangle height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle.toString());
		
		sc.close();
	}

}
