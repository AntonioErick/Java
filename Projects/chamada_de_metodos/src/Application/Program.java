package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();
		
		System.out.println("End of program");
	}

	public static void method1() {
		System.out.println("***METHOD1 START***");
		
		method2();
		
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {

		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) { //significa que esta acessando indece do array fora do limite
			System.out.println("Inlavide position!");
			e.printStackTrace(); //imprime toda a chamada de metodos
		}
		
		catch(InputMismatchException e) { // um valor que não pode ser convertido para um inteiro
			System.out.println("Inpuy error!!");
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
	}
}