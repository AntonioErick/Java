package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Utilities.Circle;
import Utilities.Rectangle;
import Utilities.Shape;
import Utilities.enuns.Color;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//o tipo da lista é "Shape" para aceitar dados de todos os tipos das subclasses
		List<Shape> list = new ArrayList<>();
		
		System.out.println("------------------------------------------------------");
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("------------------------------------------------------");
			System.out.println("Shape #"+(i+1)+" data:");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			}
			else{
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		System.out.println("------------------------------------------------------");
		System.out.println("SHAPE AREAS: ");
		
		for(Shape shp : list) {
			System.out.println(String.format("%.2f", shp.area()));
		}
		System.out.println("------------------------------------------------------");
		
		sc.close();
	}

}
