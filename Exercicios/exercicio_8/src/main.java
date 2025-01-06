import java.util.Scanner;
/*
8)	Faça um programa que calcule a quantidade de litros de combustível gasta em uma  viagem,  
utilizando  um  automóvel  que  faz  12Km  por  litro.  Para  obter  o cálculo, o usuário 
deve fornecer o tempo gasto na viagem e a velocidade média durante  ela.  Desta  forma,  
será  possível  obter  a  distância  percorrida  com  a fórmula DISTANCIA = TEMPO * VELOCIDADE. 
Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na 
viagem com a fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores 
da velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade de litros 
utilizada na viagem.
*/
public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double temp, vm, dist, ql;
		
		System.out.println("Informe o tempo de duraçao da viagem: ");
		temp = sc.nextDouble();
		System.out.println("informe a velocidade media durante a viagem: ");
		vm = sc.nextDouble();
		
		dist = temp * vm;
		ql = dist/12.0;
		
		System.out.println("__________________________________");
		System.out.println("Velocidade media: "+ vm);
		System.out.println("Tempo gasto: "+temp);
		System.out.println("Distancia percorrida: "+dist);
		System.out.println("Quantidade de litros utilizado: "+ql);
		System.out.println("__________________________________");
		
		sc.close();
	}

}
