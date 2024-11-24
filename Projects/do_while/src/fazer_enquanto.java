import java.util.Scanner;
import java.util.Locale;

public class fazer_enquanto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		double c, f;
		char cont;
		
		do {
			
			System.out.println("Informe a temperatura em celsius: ");
			c = sc.nextDouble();
			
			f = 9*c/5 + 32;
			
			System.out.printf("A temperatura em em fahrenheit é: %.2f%n", f);
			System.out.println("Deseja continuar (s/n)?");
			cont = sc.next().charAt(0);
			
		}while(cont == 's');
		
		sc.close();
	}

}
