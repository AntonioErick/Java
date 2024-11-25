package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Register;

public class Program_bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		double balance = 0;
		int id;
		
		System.out.println("Enter account number: ");
		id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.println("Is there an initial deposit(y/n)?");
		char i = sc.next().charAt(0);
		
		if(i == 'y') {
			System.out.println("Enter initial deposit value: ");
			balance = sc.nextDouble();
		}
		
		Register register = new Register(name, id, balance);
		
		System.out.println("Account data: ");
		System.out.println(register.toString());
		
		System.out.println("Enter deposit value: ");
		balance = sc.nextDouble();
		register.Deposit(balance);
		System.out.println(register.toString());
		
		System.out.println("Enter withdraw value: ");
		balance = sc.nextDouble();
		register.withDraw(balance);
		System.out.println(register.toString());
		
		sc.close();
	}

}
