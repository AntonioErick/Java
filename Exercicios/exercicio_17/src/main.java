import java.util.Scanner;

/*
 17)Crie o programa para calcular o aumento salarial de um empregado.
Por padrão, o aumento será de 15%. Entretanto, deve ser aplicada uma regra 
diferente para cada faixa salarial. Regras:
a)  se 1.500,00 <= salarioAtual < 1.750,00: aumento igual a 12% 
b)  se 1.750,00 <= salarioAtual < 2.000,00: aumento igual a 10% 
c)  se 2.000,00 <= salarioAtual < 3.000,00: aumento igual a 7% 
d)  se salarioAtual acima de 3.000,00: aumento igual a 5%. 
 */

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double salario, novo_salario;
		
		System.out.println("Informe o seu salario atual: ");
		salario = sc.nextDouble();
		
		if (salario <= 1500.00 && salario < 1750.00) {
			novo_salario = (0.12*salario) + salario;
		}
		else if(salario <= 1750.00 && salario < 2000.00) {
			novo_salario = (0.10*salario)+ salario;
		}
		else if(salario <= 2000.00 && salario < 3000.00) {
			novo_salario = (0.07*salario)+ salario;
		}
		else if(salario > 3000.00) {
			novo_salario = (0.05*salario)+ salario;
		}
		else {
			novo_salario = (0.15*salario)+ salario;
			}
		
		System.out.println("__________________________________");
		System.out.printf("Seu novo salário é de: R$ %.2f%n", novo_salario);
		System.out.println("__________________________________");
	}

}

