package Application;

/*
 Sao classes que tem o objetivo de tratar os tipos primitivos como classes de forma transparente
 ao compilador, sem voce precisar se preocupar em fazer converssoes e casts
 */
public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		
		Integer obj = x;

		
		System.out.println(obj);
		
		int y = obj;
		
		System.out.println(y);

	}

}
