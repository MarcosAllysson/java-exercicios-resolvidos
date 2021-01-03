package exemplos20181108;

import java.util.Random;
import javax.swing.JOptionPane;

public class BuscaBinaria {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[20];
        for(int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
        BuscaBinaria bb = new BuscaBinaria();
        bb.quickSort(array, 0, array.length);
        System.out.println("Array ordenado:");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
        int numProcurado = Integer.parseInt(JOptionPane.showInputDialog("Qual número deseja procurar?"));
        int posicao = bb.buscaBinaria(array, numProcurado, 0, array.length);
        if(posicao == -1) {
            JOptionPane.showMessageDialog(null, "O número não foi encontrado.");
        } else {
            JOptionPane.showMessageDialog(null, "O número foi encontrado na posição "+posicao);
        }
    }
    
    int buscaBinaria(int[] array, int numProcurado, int inicio, int fim) {
        // Caso Base
        if(fim-inicio <= 1) {
            return -1;
        }
        // Relação de Recorrência
        int meio = (inicio+fim)/2;
        if(array[meio] == numProcurado) {
            return meio;
        } else if(array[meio] < numProcurado) {
            return buscaBinaria(array, numProcurado, meio, fim);
//        } else if(array[meio] > numProcurado) {
        } else {
            return buscaBinaria(array, numProcurado, inicio, meio);
        }
    }
    
    void quickSort(int[] array, int inicio, int fim) {
        // Caso Base
        if(fim <= inicio+1) {
            return;
        }
        // Relação de Recorrência
        int pivot = particionamento(array, inicio, fim);
        quickSort(array, inicio, pivot);
        quickSort(array, pivot+1, fim);
    }
    int particionamento(int[] array, int inicio, int fim) {
        int pivot = inicio+1;
        int swap;
        for(int i = pivot; i < fim; i++) {
            if(array[i] < array[inicio]) {
                swap = array[i];
                array[i] = array[pivot];
                array[pivot] = swap;
                pivot++;
            }
        }
        pivot--;
        swap = array[pivot];
        array[pivot] = array[inicio];
        array[inicio] = swap;
        return pivot;
    }

}
