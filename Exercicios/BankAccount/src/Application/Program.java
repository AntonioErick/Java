package Application;

import java.util.Locale;
import java.util.Scanner;

import Utilities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("_____________________________________________________");
		System.out.print("Enter accounter number: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter accounter holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit value(y/n)?");
		char response = sc.next().charAt(0);
		
		Account account;
		
		if(response == 'y') {
			System.out.print("Enter initial deposite value: ");
			double balance = sc.nextDouble();
			account = new Account(holder, id, balance);
		}
		else {
			account = new Account(holder, id);
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("Account data: ");
		System.out.println(account.toString());
		System.out.println("----------------------------------------------------");
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.Deposit(deposit);
		
		System.out.println("-----------------------------------------------------");
		System.out.println(account.toString());
		System.out.println("-----------------------------------------------------");
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withDraw(withdraw);
		
		System.out.println("-----------------------------------------------------");
		System.out.println(account.toString());
		System.out.println("_____________________________________________________");
		
		sc.close();
	}

}
