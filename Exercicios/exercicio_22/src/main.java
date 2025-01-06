import java.util.Scanner;
import java.util.Locale;

/*
22)	Faça um programa, utilizando estrutura de condição, que receba um número real, 
digitado pelo usuário e mostre o menu para selecionar o tipo de cálculo que deve ser realizado:
101-Raiz quadrada
102-A metade
103-10% do número
104-O dobro
*/

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double x;
		int op;
		double result;
		
		System.out.println("____________________________________________");
		
		do {
			System.out.println("Informe um numero real: ");
			x = sc.nextInt();
			
			System.out.println("----------------------------------------");
			System.out.println("Escolha a operaçao que deseja realizar:");
			System.out.println("101 -> Raiz Quadrada");
			System.out.println("102 -> Metade");
			System.out.println("103 -> 10%");
			System.out.println("104 -> O dobro");
			System.out.println("----------------------------------------");
			op = sc.nextInt();
			
			switch(op) {
				case 101:
					result = Math.sqrt(x);
					System.out.printf("Resultado: %.2f%n", result);
					System.out.println("____________________________________________");
					break;
				case 102:
					result = x/2;
					System.out.printf("Resultado: %.2f%n", result);
					System.out.println("____________________________________________");
					break;
				case 103:
					result = 0.10 * x;
					System.out.printf("Resultado: %.2f%n", result);
					System.out.println("____________________________________________");
					break;
				case 104:
					result = x*2;
					System.out.printf("Resultado: %.2f%n", result);
					System.out.println("____________________________________________");
					break;
				case 0:
					System.out.println("Encerrando o programa...");
					System.out.println("____________________________________________");
					break;
				default:
					System.out.println("Opçao invalida.");
					System.out.println("____________________________________________");
					break;
			}
		}while(op != 0);
		
		sc.close();
	}

}
