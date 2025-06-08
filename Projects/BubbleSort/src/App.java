public class App {
    public static void main(String[] args) throws Exception {
        
        int[] array = {14, 40, 16, 22, 60};

        BubbleSort(array);
    }

    public static void BubbleSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
