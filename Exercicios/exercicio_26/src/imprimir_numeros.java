import java.util.Scanner;
/*
 26)	Faça um programa que imprima todos os números inteiros de 1 a N (fornecido pelo usuário).
 */
public class imprimir_numeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int x = sc.nextInt();
		
		for (int i = 0; i <= x; i++) {
			System.out.println(i);
		}
	}

}
