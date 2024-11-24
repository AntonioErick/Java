import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = 10.0;
		double y = 30.0;
		double valor = 200.00;
		double preco, preco2;
		double area, area2;
		double A, B;
		
		area =  x * y;
		preco = area * valor;
		
		System.out.println("Em um terreno retangular 10x30, com valor por metro quadrado de 200.");
		System.out.printf("A área é: %.2f%n",area);
		System.out.printf("E seu preço de acordo com a área é: %.2f%n",preco);
		System.out.println("______________________________________");
		System.out.println("Informe 2 valores para calcular a área do seu terreno retangular:");
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		area2 = A * B;
		preco2 = area2 * valor;
		
		System.out.printf("A área do seu terreno é: %.2f%n", area2);
		System.out.printf("E o valor conforme o preço de 200.00 por metro quadrado é: %.2f", preco2);
		
		sc.close();
	}

}
