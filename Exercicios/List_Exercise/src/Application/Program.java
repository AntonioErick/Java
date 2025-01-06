package Application;

import java.util.Scanner;

import Utilities.Employee;

import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		//PARTE 1 - Registrando empregados
	
		System.out.println("________________________________________________________________");
		System.out.print("How many employess will be registed? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("----------------------------------------------------------------");
			sc.nextLine();
			
			System.out.println("Employee #"+(i +1)+":");
			System.out.print("Enter ID: ");
			int id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("ID already taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter salary: ");
			Double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		//PARTE 2 - Atualizando salário
		
		System.out.println("________________________________________________________________");
		sc.nextLine();
		
		System.out.print("Enter the employee ID that will have a salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This ID does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.salaryIncrese(percentage);
		}
		System.out.println("________________________________________________________________");
		
		//PARTE 3 - Lista dos funcionarios
		
		System.out.println("List of employees:");
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("________________________________________________________________");
		sc.close();
	}
	
	private static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
