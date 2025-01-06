package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Informe o número de linhas da matriz: ");
		int n = sc.nextInt();
		
		System.out.print("Informe o número de coulunas da matriz: ");
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("----------------------");
		System.out.println("Enter a number:");
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position "+i+","+j);
					
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: "+ mat[i-1][j]);
					}
					if(j < mat[i].length-1) {
						System.out.println("Rigth: "+ mat[i][j+1]);
					}
					if(i < mat.length-1) {
						System.out.println("Down: "+ mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
