import java.util.Scanner;
public class exemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, taxa;
		int b = 100; 
		
		System.out.println("Informe a quantidade de minutos consumidos: ");
		x = sc.nextInt();
		
		if (x <= 100) {
			System.out.println("Valor a pagar: R$ 50,00");
		}
		else {
			taxa = x - b;
			taxa = (2*taxa) + 50;
			System.out.println("Valor a pagar: R$"+taxa);
		}

		sc.close();
	}

}
