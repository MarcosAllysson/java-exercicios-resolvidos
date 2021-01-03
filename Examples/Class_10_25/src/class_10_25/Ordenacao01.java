/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos20181026;

import java.util.*;

/**
 *
 * @author yoda
 */
public class Ordenacao {
    public static void main(String[] args) {
        int[] array = new int[20000000];
        Random r = new Random();
//        System.out.println("Array desordenado:");
        for(int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10*array.length);
//            System.out.print(array[i]+" ");
        }
        
        Ordenacao o = new Ordenacao();
        int[] clone;
        long horarioInicial;
        long horarioFinal;
        long tempoGasto;
        
//        int[] clone = array.clone();
//        long horarioInicial = System.currentTimeMillis();
//        o.bubbleSort(clone);
//        long horarioFinal = System.currentTimeMillis();
//        long tempoGasto = horarioFinal-horarioInicial;
//        System.out.println("\n\nBubble Sort1:\tTempo gasto: "+tempoGasto/1000.0+" segundos");
//        
//        clone = array.clone();
//        horarioInicial = System.currentTimeMillis();
//        o.bubbleSort2(clone);
//        horarioFinal = System.currentTimeMillis();
//        tempoGasto = horarioFinal-horarioInicial;
//        System.out.println("\n\nBubble Sort2:\tTempo gasto: "+tempoGasto/1000.0+" segundos");
        
//        clone = array.clone();
//        horarioInicial = System.currentTimeMillis();
//        o.cocktailSort(clone);
//        horarioFinal = System.currentTimeMillis();
//        tempoGasto = horarioFinal-horarioInicial;
//        System.out.println("\n\nCocktail Sort:\tTempo gasto: "+tempoGasto/1000.0+" segundos");
        
//        clone = array.clone();
//        horarioInicial = System.currentTimeMillis();
//        o.unnamedSort(clone);
//        horarioFinal = System.currentTimeMillis();
//        tempoGasto = horarioFinal-horarioInicial;
//        System.out.println("\n\nUnnamed Sort:\tTempo gasto: "+tempoGasto/1000.0+" segundos");
        
//        clone = array.clone();
//        horarioInicial = System.currentTimeMillis();
//        o.selectionSort(clone);
//        horarioFinal = System.currentTimeMillis();
//        tempoGasto = horarioFinal-horarioInicial;
//        System.out.println("\n\nSelection Sort:\tTempo gasto: "+tempoGasto/1000.0+" segundos");
//        
//        clone = array.clone();
//        horarioInicial = System.currentTimeMillis();
//        o.gnomeSort(clone);
//        horarioFinal = System.currentTimeMillis();
//        tempoGasto = horarioFinal-horarioInicial;
//        System.out.println("\n\nGnome Sort:\tTempo gasto: "+tempoGasto/1000.0+" segundos");
//        
//        clone = array.clone();
//        horarioInicial = System.currentTimeMillis();
//        o.insertionSort(clone);
//        horarioFinal = System.currentTimeMillis();
//        tempoGasto = horarioFinal-horarioInicial;
//        System.out.println("\n\nInsertion Sort:\tTempo gasto: "+tempoGasto/1000.0+" segundos");
//        
//        clone = array.clone();
//        horarioInicial = System.currentTimeMillis();
//        o.mergeSort(clone, 0, array.length);
//        horarioFinal = System.currentTimeMillis();
//        tempoGasto = horarioFinal-horarioInicial;
//        System.out.println("\n\nMerge Sort:\tTempo gasto: "+tempoGasto/1000.0+" segundos");
        
        clone = array.clone();
        horarioInicial = System.currentTimeMillis();
        o.quickSort(clone, 0, array.length);
        horarioFinal = System.currentTimeMillis();
        tempoGasto = horarioFinal-horarioInicial;
        System.out.println("\n\nQuick Sort:\tTempo gasto: "+tempoGasto/1000.0+" segundos");
        
//        System.out.println("\nArray ordenado:");
//        for(int i = 0; i < clone.length; i++) {
//            System.out.print(clone[i]+" ");
//        }
    }
    
    void bubbleSort(int[] array) {
        int swap;
        boolean houveTroca;
        do {
            houveTroca = false;
            for(int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    swap = array[i];
                    array[i] = array[i+1];
                    array[i+1] = swap;
                    houveTroca = true;
                }
            }
        } while(houveTroca);
    }
    
    void bubbleSort2(int[] array) {
        int swap;
        for(int j = array.length-1; j >= 1; j--) {
            for(int i = 0; i < j; i++) {
                if(array[i] > array[i+1]) {
                    swap = array[i];
                    array[i] = array[i+1];
                    array[i+1] = swap;
                }
            }
        };
    }
    
    void cocktailSort(int[] array) {
        int swap;
        int inicio = 0;
        int fim = array.length-1;
        while (inicio < fim) {
            for(int i = inicio; i < fim-1; i++) {
                if(array[i] > array[i+1]) {
                    swap = array[i];
                    array[i] = array[i+1];
                    array[i+1] = swap;
                }
            }
            for(int i = fim-2; i > inicio; i--) {
                if(array[i] < array[i-1]) {
                    swap = array[i];
                    array[i] = array[i-1];
                    array[i-1] = swap;
                }
            }
            inicio ++;
            fim --;
        };
    }
    
    void unnamedSort(int[] array) {
        int swap;
        for(int i = 0; i < array.length-1; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        };
    }
    
    void selectionSort(int[] array) {
        int swap;
        int indiceDoMenor;
        for(int i = 0; i < array.length-1; i++) {
            indiceDoMenor = i;
            for(int j = i+1; j < array.length; j++) {
                if(array[indiceDoMenor] > array[j]) {
                    indiceDoMenor = j;
                }
            }
            swap = array[i];
            array[i] = array[indiceDoMenor];
            array[indiceDoMenor] = swap;
        };
    }
    
    void gnomeSort(int[] array) {
        int swap;
        int j;
        for(int i = 1; i < array.length; i++) {
            j = i;
            while((j > 0)&&(array[j] < array[j-1])) {
                swap = array[j];
                array[j] = array[j-1];
                array[j-1] = swap;
                j--;
            }
        };
    }
    
    void insertionSort(int[] array) {
        int swap;
        int j;
        for(int i = 1; i < array.length; i++) {
            j = i;
            swap = array[j];
            while((j > 0)&&(swap < array[j-1])) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = swap;
        };
    }
    
    void mergeSort(int[] array, int inicio, int fim) {
        //Caso Base
        if(fim <= inicio+1) {
            return;
        }
        // Relação de Recorrência
        int meio = (inicio+fim)/2;
        mergeSort(array, inicio, meio);
        mergeSort(array, meio, fim);
        merge(array, inicio, meio, fim);
    }
    
    void merge (int[] array, int inicio, int meio, int fim) {
        while((inicio < meio)&&(meio < fim)) {
            if(array[meio] < array[inicio]) {
                int swap = array[meio];
                for(int i = meio; i > inicio; i--) {
                    array[i] = array[i-1];
                }
                array[inicio] = swap;
                meio++;
            }
            inicio++;
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
