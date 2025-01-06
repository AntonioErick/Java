import java.util.Scanner;

/*
6)	Faça um programa que:
a) Obtenha o valor para a variável HT (horas trabalhadas no mês);
b) Obtenha o valor para a variável VH (valor hora trabalhada):
c) Obtenha o valor para a variável PD (percentual de desconto);
d) Calcule o salário bruto 
e) Calcule o total de desconto 
f) Calcule o salário líquido 
g) Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário
Liquido
*/

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double ht, vh, pd, sb, td, sl;
		
		System.out.println("Informe as horas trabalhadas: ");
		ht = sc.nextDouble();
		
		System.out.println("Informe o valor da hora trabalhada: ");
		vh = sc.nextDouble();
		
		System.out.println("Informe o percentual de desconto: ");
		pd = sc.nextDouble();
		
		sb = ht * vh;
		td = (pd/100) * sb;
		sl = sb - td;
		
		System.out.println("_____________________________________");
		System.out.println("Horas trabalhadas: "+ ht);
		System.out.println("Salário bruto: "+sb);
		System.out.println("Desconto: "+td);
		System.out.println("Salário liquido: "+sl);
		System.out.println("_____________________________________");

		sc.close();
	}

}
