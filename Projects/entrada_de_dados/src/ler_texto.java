import java.util.Scanner;

public class ler_texto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		int x;
		
		x = sc.nextInt();
		sc.nextLine();//limpar buff de leitura
		//usa-se "nextLine" para ler a linha inteira
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
