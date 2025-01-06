import java.util.Scanner;
/*
 
33)	Um hotel com 30 quartos cobra R$ 50,00 por diária e mais  uma taxa de serviços. A taxa de serviços é de:
•   R$ 4,00 por diária, se o número de diárias for < 15;
•   R$ 3,60 por diária, se o número de diárias for = 15;
•   R$ 3,00 por diária, se o número de diárias for > 15.
Faça um programa que imprima o nome e o total da conta de cada cliente do hotel. Imprima também o 
total ganho pelo hotel.

 */
public class calculo_diaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String nome;
		int clientes = 0;
		int qtd_dias;
		double diaria = 50.00;
		double lucro = 0;
		
		System.out.println("Informe a quantidade de clientes que deseja cadastrar: ");
		clientes = sc.nextInt();
		
		for(int i = 0; i < clientes; i++) {
			System.out.println("Informe o nome do "+(i+1)+"º cliente: ");
			nome = sc.next();
			System.out.println("Informe o total de diarias: ");
			qtd_dias = sc.nextInt();
			
			if (qtd_dias < 15) {
				diaria = diaria*qtd_dias + (4*qtd_dias);
				lucro += diaria;
				System.out.println("_________________________________________");
				System.out.println("Nome: "+nome);
				System.out.printf("Conta: R$ %.2f%n", diaria);
				System.out.println("_________________________________________");
				diaria = 50;
			}
			else if(qtd_dias == 15) {
				diaria = diaria*qtd_dias + (3.60*qtd_dias);
				lucro += diaria;
				System.out.println("_________________________________________");
				System.out.println("Nome: "+nome);
				System.out.printf("Conta: R$ %.2f%n", diaria);
				System.out.println("_________________________________________");
				diaria = 50;
			}
			else {
				diaria = diaria*qtd_dias + (3*qtd_dias);
				lucro += diaria;
				System.out.println("_________________________________________");
				System.out.println("Nome: "+nome);
				System.out.printf("Conta: R$ %.2f%n", diaria);
				System.out.println("_________________________________________");
				diaria = 50;
			}
			
		}
		
		System.out.printf("Lucro: R$ %.2f%n", lucro);
		
		sc.close();
	}

}
