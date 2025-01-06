
/*
 Faça um programa que imprima todos os números pares compreendidos entre 85 e 907. 
 O programa deve também calcular a soma destes valores.
 */
public class soma_de_pares {

	public static void main(String[] args) {
		
		int soma = 0;
		
		System.out.println("Numeros pares entre 85 e 907:");
		
		for(int i = 85; i <= 907; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				soma += i;
			}
		}
		
		System.out.println("A soma dos numero pares é: "+soma);
		
	}

}
