import java.util.Scanner;
import java.util.Locale;
/*
 37)	Faça um programa de calculadora simples com as seguintes operações possíveis: 
 adição, subtração, multiplicação e divisão. O programa inicia apresentando ao usuário 
 um menu de opções.
 
 Crie um programa que apresenta o menu inicial acima e retorna a opção do usuário para 
 o programa principal. Esta opção é então analisada e o programa  chama as funções de 
 adição, subtração, multiplicação e divisão conforme a opção do usuário.  Se a opção for 
 inválida, informe ao usuário e peça a ele para entrar com uma opção válida.  Após a execução 
 da operação o programa volta a apresentar o menu inicial até que o usuário encerre o programa 
 com a opção 5.
 */
public class calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int op = 0;
		
		do {
		menu();
		op = sc.nextInt();
		if(op == 1) {
			
			double[] vetor = new double[2];
			
			System.out.println("Informe os valores que deseja somar: ");
			for(int i = 0; i < 2; i++) {
				vetor[i] = sc.nextDouble();
			}
			adicao(vetor);
		}
		
		else if (op == 2) {
			
			double[] vetor = new double[2];
			
			System.out.println("Informe os valores que deseja subtrair: ");
			for (int i = 0; i < 2; i++) {
				vetor[i] = sc.nextDouble();
			}
			
			subtracao(vetor);
		}
		
		else if(op == 3) {
			
			double[] vetor = new double[2];
			
			System.out.println("Informe os valores que deseja multiplicar: ");
			for(int i = 0; i < 2; i++) {
				vetor[i] = sc.nextDouble();
			}
			multiplicacao(vetor);
		}
		
		else if(op == 4) {
			
			double[] vetor = new double[2];
			
			System.out.println("Informe os valores que deseja dividir: ");
			for(int i = 0; i < 2; i++) {
				vetor[i] = sc.nextDouble();
			}
			
			divisao(vetor);
		}
		
		else if(op ==5 ) {
			System.out.println("Encerrando o programa...");
		}
		
		else {
			System.out.println("Opçao invalidade, tente novamente.");
		}
		
		}while (op != 5);
	}
	
	public static void menu() {
		System.out.println("_____________________OPÇOES_____________________");
		System.out.println("1 - Adicao");
		System.out.println("2 - Subtraçao");
		System.out.println("3 - Multiplicaçao");
		System.out.println("4 - Divisao");
		System.out.println("5 - Sair");
		System.out.println("________________________________________________");
		System.out.println("Entre com sua opçao: ");
	}
	
	public static double adicao(double[]vetor) {
		double soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i] ; 
		}
		System.out.println("-------------------");
		System.out.printf("Resultado: %.2f%n", soma);
		System.out.println("-------------------");
		return soma;
	}
	
	public static double subtracao(double[] vetor) {
		double resultado = 0;
		for(int i = 0; i < vetor.length; i++) {
			resultado = (-vetor[i]) - resultado;
		}
		System.out.println("-------------------");
		System.out.printf("Resultado: %.2f%n", resultado);
		System.out.println("-------------------");
		return resultado;
	}
	
	public static double multiplicacao(double[]vetor) {
		double resultado = 1;
		
		for(int i = 0; i < vetor.length; i++) {
			resultado *= vetor[i] ; 
		}
		System.out.println("-------------------");
		System.out.printf("Resultado: %.2f%n", resultado);
		System.out.println("-------------------");
		return resultado;
	}
	
	public static double divisao(double[]vetor){
		double resultado = 0;
		for(int i = 0; i < vetor.length; i++) {
			resultado = vetor[0];
			resultado /= vetor[i];
		}
		System.out.println("-------------------");
		System.out.printf("Resultado: %.2f%n", resultado);
		System.out.println("-------------------");
		return resultado;
	}

}
