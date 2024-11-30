package Application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("__________________________________");
		System.out.print("Informe a quantidade de produtos que deseja cadastrar: ");
		int qtd = sc.nextInt();
		
		double[] price = new double[qtd];
		String[] name = new String[qtd];
		
		for (int i = 0; i<qtd; i++) {
			sc.nextLine();
			System.out.print("Nome do "+(i + 1)+"º produto: ");
			name[i] = sc.nextLine();
			
			System.out.print("Preço do "+(i + 1)+"º produto: ");
			price[i] = sc.nextDouble();
		}
		
		System.out.println("__________________________________");
		for (int i = 0; i<qtd; i++) {
			System.out.printf("Name: %s, Price: $ %.2f%n", name[i] , price[i]);
		}
		
		double soma = 0;
		
		for(int i =0; i < qtd; i++) {
			soma += price[i];
		}
		
		double media = soma/qtd;
		System.out.println("__________________________________");
		System.out.printf("AVARAGE PRICE = %.2f%n", media);
		
		sc.close();
	}

}
