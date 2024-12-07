package Application;

import java.util.Locale;
import java.util.Scanner;

import Utilities.Data;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Type the number of people you want to register: ");
		int n = sc.nextInt();
		System.out.println("____________________________________________________");
		
		Data[] people = new Data[n];
		
		for(int i = 0; i < people.length; i++) {
			sc.nextLine();
			System.out.print("Enter the "+(i + 1)+"º person's name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter the "+(i + 1)+"º person's age: ");
			int age = sc.nextInt();
			
			System.out.print("Enter the "+(i + 1)+"º person's height: ");
			double high = sc.nextDouble();
			System.out.println("---------------------------------------------------");
			
			people[i] = new Data(name, age, high);
		}
		
		double sum = 0; 

		for(int i = 0; i < people.length; i++) {
			sum += people[i].getHigh();
		}
		
		double avg_high = sum/n;
		int contUnder16 = 0;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg_high);
		System.out.println("---------------------------------------------------");
		
		for(int i = 0; i < people.length; i++) {
			if(people[i].getAge() < 16) {
				contUnder16 += 1;
			}
		}
		
		double porcent = (contUnder16*100.0)/5;
		
		System.out.printf("People under 16 years: %.1f%%%n", porcent);//dois %% para imprimir '%' na tela
	
		for(int i = 0; i < people.length; i++) {
			if(people[i].getAge() < 16) {
				System.out.println(people[i].getName());
			}
		}
		System.out.println("____________________________________________________");
		
		sc.close();
	}

}
