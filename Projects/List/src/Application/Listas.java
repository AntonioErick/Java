package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); 

		//adicionar elemento
		list.add("Maria");
		list.add("alex");
		list.add("Bob");
		list.add("Mario");
		list.add("Anna");
		list.add("Batman");
		
		list.add(2, "Marco"); //adciona o nome na posiçao indexada
		
		System.out.println(list.size()); //para ver o tamanho da lista
		
		for (String x : list) {
			System.out.println(x);
		}
		
		//remover elemento
		System.out.println("______________________");
		//list.remove(1);
		list.remove("Anna");
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		//mostrar posiçao de um elemento
		System.out.println("______________________");
		System.out.println("Index of Bob: "+ list.indexOf("Bob"));
		System.out.println("Index of Marco: "+ list.indexOf("Marco"));
		
		//filtrar elementos
		System.out.println("______________________");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList()); //converteu para stream, fez a operaçao lambida desejda e converteu para list dnv
		
		for (String x : result) {
			System.out.println(x);
		}
		
		//encontrar primerio elemento
		System.out.println("______________________");
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null); //retorna nulo caso o elemento nao exista
		System.out.println(name);
	}

}
