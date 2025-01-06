import java.util.Scanner;

//31)	Faça um programa que leia um número de 1 até 10 e imprima a tabuada

public class tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe um numero entre 1 e 10: ");
		int x = sc.nextInt();
		System.out.println("____________________________");
		if(x >= 1 && x <= 10) {
			for (int i = 0; i <= 10; i++) {
				System.out.println(x*i);
			}
		}
		else {System.out.println("Numero invalido");}
		System.out.println("____________________________");
		
		sc.close();
	}

}
