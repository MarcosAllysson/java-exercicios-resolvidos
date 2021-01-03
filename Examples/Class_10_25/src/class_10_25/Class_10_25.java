package class_10_25;

import java.util.Random;
import javax.swing.JOptionPane;

public class Class_10_25 {
    public static void main(String[] args) {
        int [] array = new int[20];
        Random r = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(20);
            System.out.println(array[i]+" ");
        }
        
        int numeroProcurado = Integer.parseInt(JOptionPane.showInputDialog("Qual número procuras? "));
        Class_10_25 adbs = new Class_10_25();
//        int posicao = adbs.buscaSequencial(array, numeroProcurado);
//        if (posicao != -1){
//            System.out.println(" \n O número está na posição " +posicao);
//        } else {
//            System.out.println("Não encontrado! ");
//        }
    }
    void buscaSequencial(int [] array, int numeroProcurado){
        int contador = 0;
        for (int i=0; i<array.length; i++){
            if (array[i] == numeroProcurado){
                System.out.println("\n O número está na posicação " +i);
                contador ++;
            }
        }
        if (contador == 0){
            System.out.println("Não foi encontrado nenhuma ocorrência.");
        }
        else {
            System.out.println("Foram encontradas: " +contador+ " ocorrências.");
        }
    }
    
//    int buscaSequencial(int [] array, int numeroProcurado){
//        for (int i=0; i<array.length; i++){
//            if (array[i] == numeroProcurado){
//                return i;
//            }
//        }
//        return -1; 
//    }
//    
}
