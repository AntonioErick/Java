package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Grade;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Grade grade = new Grade();
		
		System.out.println("_________________________________");
		System.out.println("Enter student dada. ");
		
		System.out.println("---------------------------------");
		System.out.print("Name: ");
		grade.name = sc.nextLine();
		
		System.out.println("---------------------------------");
		System.out.print("1º grade: ");
		grade.n1 = sc.nextDouble();
		
		System.out.println("---------------------------------");
		System.out.print("2º grade: ");
		grade.n2 = sc.nextDouble();
		
		System.out.println("---------------------------------");
		System.out.print("3º grade: ");
		grade.n3 = sc.nextDouble();
		
		System.out.println("---------------------------------");
		System.out.println(grade.toString());
		System.out.println("_________________________________");
		
		sc.close();
	}

}
