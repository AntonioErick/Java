import java.util.Scanner;

//38)	Faça um programa que preecha um vetor : V[5] e mostre os valores lidos.

public class vetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe 5 numeros: ");
		
		int vetor[] = new int[5];
		
		for(int i = 0; i < 5; i++){
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Numeros armazenados: ");
		for(int i = 0; i < 5; i++){
			System.out.println(vetor[i]+" ");
		}

	}

}
