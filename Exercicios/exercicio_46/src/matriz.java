import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the matrix size: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		//preenche a matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("---------------");
		//imprime a matriz
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		//define qual o maior valor e sua posiçao
		
		int count = mat[0][0];
		int row = 0;
		int col = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] > count) {
					count = mat[i][j];
					row = i;
					col = j;
				}
			}
		}
		
		System.out.println("High value: "+count);
		System.out.println("Position: "+row+","+col);
		
		System.out.println("---------------");
		System.out.println("Main diagonal: ");
		
		for(int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}
		
		System.out.println("---------------");
		System.out.println("Switched lines");
		
		for(int j = 0; j < mat[0].length; j++) { //mat[0].length significa o número total de colunas na matriz que ela irá percorrer
			int auxiliar = mat[0][j]; //vai salvar o valor da primeira linha
			mat[0][j] = mat[n-1][j]; //Substitui o elemento da primeira linha pelo elemento da última linha.
			mat[n-1][j] = auxiliar; //Substitui o elemento da última linha pelo valor que estava guardado na variável temp
		}
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println("");
		}

		sc.close();
	}

}
