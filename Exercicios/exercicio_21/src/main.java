import java.util.Scanner;

/*
 21)	Um determinado clube de futebol pretende classificar seus atletas em categorias e  
 para  isto  ele  contratou  um  programador  para  criar  um  programa  que executasse 
 esta tarefa. Para isso o clube criou uma tabela que continha a faixa etária do atleta e 
 sua categoria. A tabela está demonstrada abaixo:
IDADE             CATEGORIA 
De 05 a 10      Infantil
De 11 a 15      Juvenil
De 16 a 20      Junior
De 21 a 25      Profissional
Construa um programa que solicite o nome e a idade de um atleta e imprima a sua categoria.
 */

public class main {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Informe o número de atletas que deseja cadastrar: ");
		int contador = sc.nextInt();
		
		for(int i=0; i<contador; i++) {
			System.out.println("Informe o nome do atleta:");
			nome = sc.next();
			System.out.println("Informe a idade: ");
			idade = sc.nextInt();
			
			if(idade >= 5 && idade <= 10) {
				System.out.println("_____________________________________");
				System.out.printf("Nome: %s%nCategoria: Infantil%n",nome);
				System.out.println("_____________________________________");
			}
			else if(idade >= 11 && idade <= 15) {
				System.out.println("_____________________________________");
				System.out.printf("Nome: %s%nCategoria: Juvenil%n",nome);
				System.out.println("_____________________________________");
			}
			else if(idade >= 16 && idade <= 20) {
				System.out.println("_____________________________________");
				System.out.printf("Nome: %s%nCategoria: Junior%n",nome);
				System.out.println("_____________________________________");
			}
			else if(idade >= 21 && idade <= 25) {
				System.out.println("_____________________________________");
				System.out.printf("Nome: %s%nCategoria: Profissinal%n",nome);
				System.out.println("_____________________________________");
			}
			
		}
		
		sc.close();
	}

}
