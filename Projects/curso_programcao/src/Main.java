import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.545454;
		System.out.println(x);
		System.out.printf("%.2f%n", x); //%n = quebra de linha
		System.out.print(y);
		
		Locale.setDefault(Locale.US); //Imprime a variavel double com um ponto ao invés da virgula
		System.out.printf("%.3f%n", x);
		
		System.out.println("RESULTADO = " + y + " METROS");
		
		System.out.printf("RESULTADO = %.2f METROS%n", x);

		System.out.println("__________________________________");
		String nome = "Joao";
		int idade = 31;
		double renda = 1500.00;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
	}

}
