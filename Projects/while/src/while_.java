import java.util.Scanner;

public class while_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
		int x = sc.nextInt();
		int soma = 0;
		soma = soma + x;
		
		while(x != 0) {
			x = sc.nextInt();
			soma += x;
		}
		
		System.out.println("A soma dos valores é: "+soma);
		
		sc.close();

	}

}
