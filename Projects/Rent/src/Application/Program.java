package Application;

import java.util.Locale;
import java.util.Scanner;

import Utilities.Room;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("__________________________________________________");
		System.out.println("How many rooms will be rented? ");
		int qtd = sc.nextInt();
		
		if(qtd < 10) {
			Room[] vect= new Room[10];
			
			for(int i = 0; i < qtd; i++) {
				sc.nextLine();
				
				System.out.println("----------------------------------------------");
				System.out.println("Rent #"+(i+1));
				
				System.out.print("Enter client name: ");
				String name = sc.nextLine();
				System.out.print("Enter client email: ");
				String email = sc.next();
				System.out.print("Enter client room: ");
				int room = sc.nextInt();
				
				vect[room] = new Room(name, email);		
			}
			
			System.out.println("__________________________________________________");
			System.out.println("Busy rooms: ");
			for(int i = 0; i < vect.length; i++) {
				if(vect[i] != null) {
					System.out.println(i+": "+vect[i].toString());
				}
			}
		}
		else {
            System.out.println("Rent quantity exceeds total number of rooms available.");
        }
		
		sc.close();
	}

}
