package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Utilities.Tasks;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Tasks> taskList = new ArrayList<>();
		
		int op = -1;
		
		while(op != 5) {
			menu();
			op = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
			case 1:
				adicionarTarefa(sc, taskList);
				break;
				
			case 2:
				listarTarefas(taskList);
				break;
				
			case 3:
				marcarTarefaComoConcluida(sc, taskList);
				break;
				
			case 4:
				removerTarefa(sc, taskList);
				break;
				
			case 5:
				System.out.println("Programa encerrado.");
				break;
				
			default:
				System.out.print("Opçao invalida! Tente novamente: ");
				op = sc.nextInt();
				sc.nextLine();
			}
		}
		
		sc.close();
	}
	
	public static void adicionarTarefa(Scanner sc, List<Tasks> taskList) {
		System.out.print("Informe a tarefa: ");
		String task = sc.nextLine();

		taskList.add(new Tasks(task));
		System.out.println("Tarefa adicionada!");
	} 
	
	public static void listarTarefas(List<Tasks> taskList) {
		if(taskList.isEmpty()) {
			System.out.println("Nenhuma tarefa encontrada.");
			return;
		}
		
		System.out.println("Tarefas:");
		for(int i = 0; i < taskList.size(); i++) {
			System.out.println((i + 1) + " - " + taskList.get(i));
		}
	}
	
	public static void marcarTarefaComoConcluida(Scanner sc, List<Tasks> taskList) {
		if(taskList.isEmpty()) {
			System.out.println("Nenhuma tarefa encontrada.");
			return;
		}
		
		listarTarefas(taskList);
		System.out.print("Informe o número da tarefa que deseja marcar como concluida: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0 && num <= taskList.size()) {
			taskList.get(num - 1).marcarComoConcluida();
			System.out.println("Tarefa concluida!");
		}
		else {
			System.out.println("Número invalido.");
		}
	}
	
	public static void removerTarefa(Scanner sc, List<Tasks> taskList) {
		if(taskList.isEmpty()) {
			System.out.println("Nenhuma tarefa encontrada.");
			return;
		}
		
		listarTarefas(taskList);
		System.out.print("Informe o número da tarefa que deseja remover: ");
		int num = sc.nextInt();
		sc.nextLine();
		
	    if (num > 0 && num <= taskList.size()) {
	        taskList.remove(num - 1);
	        System.out.println("Tarefa removida com sucesso!");
	    } else {
	        System.out.println("Número inválido! Escolha um número entre 1 e " + taskList.size() + ".");
	    }
	}
	
	public static void menu() {
		System.out.println("------------------------------------------------------");
		System.out.println("| [1] - Adicionar tarefa                             |");
		System.out.println("| [2] - Listar todas as tarefas                      |");
		System.out.println("| [3] - Marcar uma tarefa como concluída             |");
		System.out.println("| [4] - Remover tarefa                               |");
		System.out.println("| [5] - Sair                                         |");
		System.out.println("------------------------------------------------------");
	}
}

