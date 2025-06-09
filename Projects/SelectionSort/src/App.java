public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {5, 10, 7, 1, 8, 11};    

        for(int i = 0; i < numeros.length - 1; i++){
            int menor  = Menor(numeros, i); 
            int atual = numeros[i]; 
            int menorArray = numeros[menor];  
            numeros[i] = menorArray;
            numeros[menor] = atual;
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]+"\t");
        }
    }

    public static int Menor(int[] numeros, int atual){
        int menor = atual;
        for(int i = atual; i < numeros.length; i++){
            if(numeros[menor] > numeros[i]){
                menor = i;
            }
        }
        return menor;
    }
}
