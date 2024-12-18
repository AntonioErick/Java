package Application;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Utilities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		//Add employee
		
		System.out.println("________________________________________________________");
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("-----------------------------------------------------------");
			System.out.print("Enter ID: ");
			int id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("ID already taken, Try again: ");
				id = sc.nextInt();
			}
			
			System.out.println("-----------------------------------------------------------");
			sc.nextLine();
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		//Update salary
		
		System.out.println("________________________________________________________");
		System.out.println("Enter the employee ID that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist");
		}
		else {
			System.out.print("Enter the percntage: ");
			double percentage = sc.nextDouble();
			emp.increseSalary(percentage);
		}
		
		//Listing employee
		
		System.out.println("________________________________________________________");
		System.out.println("List fo employee: ");
		
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

	private static boolean hasId(List<Employee> list, int id) {
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		return emp != null;
	}

}
