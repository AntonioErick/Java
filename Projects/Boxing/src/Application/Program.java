package Application;

/*
 Boxing é o processo de conversao de um objeto tipo valor para um objeto tipo referencia compatível. 
 */

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x;

		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
	}

}
