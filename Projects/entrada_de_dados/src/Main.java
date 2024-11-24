import java.util.Scanner;
import java.util.Locale;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//String x;
		//System.out.println("Digite um palavra:");
		//x = sc.next();
		//System.out.println("Voce digitou: "+x);
		
		//double x;
		//x = sc.nextDouble();
		//System.out.println("Informe um numero de ponto flutuante:");
		//System.out.println("Voce digitou: "+x);
		//System.out.printf("Voce digitou: %.2f%n", x);
		
		char x;
		x = sc.next().charAt(0);
		System.out.println("Voce digitou: "+x);
		
		sc.close();
		
		//para cada tipo de variável, usa-se:
		//String -> sc.next();
		//Int -> sc.nextInt();
		//String -> sc.nextDouble();
		//Char -> sc.next().charAt(0);
		 
		 
 
	}

}
