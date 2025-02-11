package Application;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import Utilities.Page;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Random random = new Random();

		Page ram[] = new Page[4];
		Page hd[] = new Page[6];
		
		inicializarMemoria(ram, hd);
		
		int opcao = -1;
		
		while(opcao != 0) {
			menu();
			opcao = sc.nextInt();
			System.out.println();
			
			switch(opcao) {
			case 1:
				try{
					System.out.print("Qual índice do disco sera usado no page in (0 a "+(hd.length -1)+")? ");
					int pageHd = sc.nextInt();
					 
					if(pageHd < 0 || pageHd >= hd.length || hd[pageHd] == null) {
						System.out.println("Erro: índice inválido ou página inxistente no HD");
						break;
					}
					 
					System.out.println("A página associada a esse índice do disco é: "+ hd[pageHd].getNome());
					System.out.println("O algoritmo está selecionando página da RAM para ser substituída...");
					 
					int selection = random.nextInt(ram.length);
					 
					System.out.println("O índice escolhido pelo algoritmo para sair da RAM foi: "+ selection);
					System.out.println("A página atualmente associada a esse índice é: "+
					(ram[selection] != null ? ram[selection].getNome() : "Vazio"));
					 
					//substituindo
					ram[selection] = hd[pageHd];
					System.out.println("A pagina "+hd[pageHd].getNome()+" foi carregada na RAM.");
					System.out.println();
				}
				catch(Exception e) {
					  System.out.println("Erro: Entrada inválida. Tente novamente.");
				        sc.nextLine();
				}
				
				break;
				
			case 2:
				try {
					System.out.print("Qual índice da RAM será referenciado (0 a "+(ram.length - 1)+")? ");
					int pageRam = sc.nextInt();
					
					if(pageRam < 0 || pageRam > ram.length || ram[pageRam] == null) {
						System.out.println("Erro: índice inválido ou página nenhuma página carregada nesse RAM");
					     break;
					}
					System.out.println("A página associada a esse índice é: "+ram[pageRam].getNome());
					System.out.println("Referenciando página da RAM...");
					System.out.println("A página "+ram[pageRam].getNome()+" foi referenciada com sucesso!");
					
					int selection = random.nextInt(ram.length);
					
					System.out.println("O índice escolhido pelo algoritmo a ser referenciado foi: "+selection);
					System.out.println();
				}
				catch(Exception e) {
					System.out.println("Erro: Entrada inválida. Tente novamente.");
			        sc.nextLine();
				}
				break;
				
			case 3:
				System.out.println("--------------------------------------------");
				System.out.println("Estado atual da RAM: ");
				System.out.println();
				
				for(int i = 0; i < ram.length; i++) {
					System.out.println("RAM["+i+"]: "+ (ram[i].getNome() != null ? ram[i].getNome() : "Vazio"));
				}
				
				System.out.println();
				System.out.println("--------------------------------------------");
				System.out.println("Estado atual do HD: ");
				System.out.println();
				
				for(int i = 0; i < hd.length; i++) {
					System.out.println("HD["+i+"]: "+ (hd[i].getNome() != null ? hd[i].getNome() : "Vazio"));
				}
				System.out.println("--------------------------------------------");
				
				System.out.println();
				break;
				
			case 0:
				System.out.println("Encerrando programa...");
				break;
			
			default:
				System.out.println("Opção inválida! Escolha uma opção válida.");
			}
		}
		
		sc.close();
	}

	public static void menu() {
		System.out.println("___________________ MENU ___________________");
		System.out.println("[1] - REALIZAR PAGE IN ");
		System.out.println("[2] - REFERENCIAR QUADRO DA RAM ");
		System.out.println("[3] - VISUALIZAR RAM E DISCO ATUALMENTE ");
		System.out.println("[0] - SAIR ");
		System.out.println("____________________________________________");
	}
	
	public static void inicializarMemoria(Page ram[], Page hd[]) {
		// Páginas de A
		hd[0] = new Page("PARTE 1 DE A");
		hd[1] = new Page("PARTE 2 DE A");
		ram[0] = new Page("PARTE 3 DE A");

		// Páginas de B
		hd[2] = new Page("PARTE 1 DE B");
		hd[3] = new Page("PARTE 2 DE B");
		hd[4] = new Page("PARTE 3 DE B");
		hd[5] = new Page("PARTE 4 DE B");

		// Páginas de C
		ram[1] = new Page("PARTE 1 DE C");
		ram[2] = new Page("PARTE 2 DE C");
		ram[3] = new Page("PARTE 3 DE C");
	}
}
