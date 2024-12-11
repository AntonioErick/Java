//opcional para correr coleçoes

public class for_each {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria", "Bob", "Chaves"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("______________________");
		for(String obj : vect) {
			System.out.println(obj);
		}
		//o que estiver contido nesse for será executado para cada elemento do vetor
	}

}
