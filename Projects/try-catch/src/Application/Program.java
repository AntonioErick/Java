package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) { //significa que esta acessando indece do array fora do limite
			System.out.println("Inlavide position!");
		}
		
		catch(InputMismatchException e) { // um valor que não pode ser convertido para um inteiro
			System.out.println("Inpuy error!!");
		}
		
		sc.close();
	}
}
