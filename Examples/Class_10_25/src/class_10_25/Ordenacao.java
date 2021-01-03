package class_10_25;

import java.util.Random;

public class Ordenacao {
    public static void main(String[] args) {
        int [] array = new int[50000];
        Random r = new Random();
        System.out.println("Array desordenado: ");
        for (int i=0; i<array.length; i++){
            array[i] = r.nextInt();
            System.out.print(array[i]+" ");
        }
        Ordenacao o = new Ordenacao();
        long horarioInicial = System.currentTimeMillis();
        o.bubbleSort(array);
        long horarioFinal = System.currentTimeMillis();
        long tempoGasto = horarioFinal - horarioInicial;
        System.out.print("\n\n Tempo gasto: " +tempoGasto);
        
        System.out.println("\n\n Array Ordenado: ");
        for (int i=0; i<array.length; i++){
            //array[i] = r.nextInt(100);
            System.out.print(array[i]+" ");
        }
    }
    
    void bubbleSort(int [] array){
        int swap;
        boolean houveTroca;
        do {
            houveTroca = false;
            for (int i = 0; i < array.length-1; i++){
                if (array[i] > array[i+1]){
                    swap = array[i];
                    array[i] = array[i+1];
                    array[i+1] = swap;
                    houveTroca = true;
                }
            }
        } while (houveTroca);
    }
}
