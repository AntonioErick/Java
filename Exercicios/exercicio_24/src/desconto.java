import java.util.Scanner;
/*
24)	Faça  um  programa  que  receba  o  valor  da  venda,  escolha  a  condição  de pagamento no 
menu e mostre o total da venda final conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5% 
Venda a Prazo 60 dias - mesmo preço 
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8% Venda com cartão de crédito - desconto de 7%
*/
public class desconto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double desconto;
		
		System.out.println("Informe o valor da venda: ");
		double venda = sc.nextDouble();
		
		System.out.println("_____________________________________________");
		System.out.println("Escolha a forma de pagamento: ");
		System.out.println("---------------------------------------------");
		System.out.println("1 - Venda a Vista - desconto de 10%");
		System.out.println("2 - Venda a Prazo 30 dias - desconto de 5% ");
		System.out.println("3 - Venda a Prazo 60 dias - mesmo preço ");
		System.out.println("4 - Venda a Prazo 90 dias - acréscimo de 5%");
		System.out.println("5 - Venda com cartão de débito - desconto de 8%");
		System.out.println("6 - Venda com cartão de crédito - desconto de 7%");
		System.out.println("_____________________________________________");
		int op = sc.nextInt();
		
		switch(op) {
			case 1:
				desconto = venda - (0.10 * venda);
				System.out.printf("Valor final será de: R$ %.2f%n", desconto);
				System.out.println("_____________________________________________");
				break;
			case 2:
				desconto = venda - (0.05 * venda);
				System.out.printf("Valor final será de: R$ %.2f%n", desconto);
				System.out.println("_____________________________________________");
				break;
			case 3:
				desconto = venda;
				System.out.printf("Valor final será de: R$ %.2f%n", desconto);
				System.out.println("_____________________________________________");
				break;
			case 4:
				desconto = (0.05 * venda) + venda;
				System.out.printf("Valor final será de: R$ %.2f%n", desconto);
				System.out.println("_____________________________________________");
				break;
			case 5:
				desconto = venda - (0.08 * venda);
				System.out.printf("Valor final será de: R$ %.2f%n", desconto);
				System.out.println("_____________________________________________");
				break;
			case 6:
				desconto = venda - (0.07 * venda);
				System.out.printf("Valor final será de: R$ %.2f%n", desconto);
				System.out.println("_____________________________________________");
				break;
			default:
				System.out.println("Opçao invalida!");
				System.out.println("_____________________________________________");
				break;
		}
		
		sc.close();
	}

}
