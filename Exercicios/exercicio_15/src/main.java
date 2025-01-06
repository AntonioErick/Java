import java.util.Scanner;

/*
15)	Considere que o último concurso vestibular apresentou três provas: Português, Matemática e 
Conhecimentos Gerais. Considerando que para cada candidato tem-se um registro contendo o seu 
nome e as notas obtidas em cada uma das provas, construa um programa que forneça:
a)  o nome e as notas em cada prova do candidato
b)  a média do candidato
c)  uma informação dizendo se o candidato foi aprovado ou não. Considere que um candidato é 
aprovado se sua média for maior que 7.0 e se não apresentou nenhuma nota abaixo de 5.0
*/

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nome;
		double n1, n2, n3, media;
		
		System.out.println("Informe o número de candidatos: ");
		int candidatos = sc.nextInt();
				
		for (int i = 0; i < candidatos; i++) {
			System.out.println(" ");
			System.out.println("Informe o nome do "+(i + 1)+"º candidato: ");
			nome = sc.next();
			
			System.out.println("Informe as notas do "+(i + 1)+"º candidato");
			
			System.out.println("Portugues: ");
			n1 = sc.nextDouble();
			System.out.println("Matematica: ");
			n2 = sc.nextDouble();
			System.out.println("Conhecimentos Gerais: ");
			n3 = sc.nextDouble();
			
			media = (n1 + n2 + n3)/3;
			
			System.out.println("_______________________________________");
			System.out.println("Nome: "+nome);
			System.out.println("---------------------------------------");
			System.out.printf("Notas:%nPortugues: %.2f%nMatematica: %.2f%nConhecimentos Gerais: %.2f%n",n1, n2, n3);
			System.out.println("---------------------------------------");
			System.out.printf("Media: %.2f%n", media);
			System.out.println("---------------------------------------");
			if (media > 7.0 || n1 >= 5.0 && n2 >= 5.0 && n3 >= 5.0) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("_______________________________________");
		}
		
		sc.close();
	}

}
