package exercicio_4;
import java.util.Scanner;

/*
 4)	escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de 
 vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 
 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e 
 salário no final do mês
 */

public class main {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de vendedor que deseja adicionar: ");
		int qtd = sc.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			
			System.out.println("Informe o nome do vendedor: ");
			String nome = sc.next();
			
			System.out.println("informe o salário fixo do vendedor: ");
			double salario_fixo = sc.nextDouble();
			
			System.out.println("Informe o monte em dinheiro de suas vendas: ");
			double vendas = sc.nextDouble();
			
			double comissao = (15.0 / 100.0) * vendas;
			double salario_total = comissao + salario_fixo;
			
			System.out.println("_____________________________________");
			System.out.println("Vendedor: "+ nome);
			System.out.printf("Salário fixo: R$ %.2f%n", salario_fixo);
			System.out.printf("Comissao: R$ %.2f%n", comissao);
			System.out.printf("Salário total: R$ %.2f%n", salario_total);
			System.out.println("_____________________________________");
			System.out.println(" ");
			
		}
		
		sc.close();
	}

}
