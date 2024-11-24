import java.util.Scanner;

public class condicinal_ternaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o preco:");
		double preco = sc.nextDouble();
		double desconto;
		
		//if (preco < 20.0) {
		//	desconto = preco *0.1;}
		//else {
		//	desconto = preco * 0.05;}

		desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;
		
		System.out.println("Desconto: "+desconto);
	}

}
