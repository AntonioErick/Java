package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Department;
import Entities.HourContract;
import Entities.Worker;
import Entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter departament's name: ");
		String departamentName = sc.nextLine();
		
		System.out.println("----------------------------------------------------");
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		/*
		  instancia um novo objeto do tipo worker, os dados sao o nome digitado, uma instancia de WorkerLevel no valor digitado
		  e o valor de salário base informado. Associado a esse objeto terá outro objeto do tipo departamento com o nome digitado.
		*/
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));
		
		System.out.println("----------------------------------------------------");
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		System.out.println("----------------------------------------------------");
		for(int i = 0; i < n; i++) {
			System.out.println("Enter contract #"+i+" data: ");
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration(hour): ");
			int hours = sc.nextInt();
			System.out.println("----------------------------------------------------");
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract); //associando contrato com o trabalhador 
		}
		
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		//recortando a String de acordo com a posiçao de seus digitos e convertendo para inteiro
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("----------------------------------------------------");
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartment().getName());
		System.out.println("Income for "+monthAndYear+": "+ String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
