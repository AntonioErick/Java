import java.util.Scanner;

/*
12)	Faça um programa que leia um número N e imprima “F1”, “F2” ou “F3”, conforme a condição:
• “F1”, se N <= 10
• “F2”, se N > 10 e N <= 100
• “F3”, se n > 100

*/
public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double N;
		
		System.out.println("Informe um valor para N: ");
		N = sc.nextDouble();
		
		if (N <= 10) {
			System.out.println("F1");
		}
		else if (N > 10 && N <= 100) {
			System.out.println("F2");
		}
		else {
			System.out.println("F3");
		}
		
		sc.close();
	}

}
