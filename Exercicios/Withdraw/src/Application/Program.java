package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter account data");
		
		System.out.println();
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		double withdraw = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdraw);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		System.out.println();
		try {
			acc.withdraw(amount);
			System.out.println("New balance: "+ String.format("%.2f", acc.getBalance()));
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
