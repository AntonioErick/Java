package Application;

import java.util.Locale;
import java.util.Scanner;

import Utilities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee employee = new Employee();
		
		System.out.println("ENTER EMPLOYEE DATA");
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println(employee.toString());
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		employee.IncreaseSalary(percentage);
		
		System.out.println(employee.toString());
		
		sc.close();
	}

}
