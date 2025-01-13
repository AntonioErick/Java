package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.LegalEntity;
import Entities.NaturalPerson;
import Entities.Person;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Person> list = new ArrayList<>();

		System.out.println("----------------------------------------------------");
		System.out.print("Enter thee number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("----------------------------------------------------");
			System.out.println("Tax payer #"+(i+1)+" data: ");
			
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			if(ch == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				
				System.out.print("Health expenditures: ");
				double healthExpenses = sc.nextDouble();
				
				list.add(new NaturalPerson(name, income, healthExpenses));
			}
			else {
				System.out.print("Name: ");
				String name = sc.nextLine();
				
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				
				list.add(new LegalEntity(name, income, employees));
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println("TAXES PAID:");
		
		for(Person person : list) {
			System.out.println(person.getName()+": $"+String.format("%.2f", person.calTax()));
		}
		
		double totalTax = 0;
		
		for(Person person : list) {
			totalTax += person.calTax();
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("TOTAL TAXES: $"+String.format("%.2f", totalTax));
		
		sc.close();
	}

}
