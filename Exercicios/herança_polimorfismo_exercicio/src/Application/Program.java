package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("--------------------------------------------------");
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("--------------------------------------------------");
			System.out.println("Employee #"+(i+1)+" data:");
			
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(outsourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalcharge = sc.nextDouble();
			
				list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalcharge));
			}
			else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("PAYMENTS:");
		
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
