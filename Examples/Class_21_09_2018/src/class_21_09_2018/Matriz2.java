package class_21_09_2018;

import java.util.Random;

public class Matriz2 {
    public static void main(String[] args) {
        int [][] matriz = new int [3][3];
        Random r = new Random();
        
        for (int i = 0; i< 3; i++){
            for (int j=0; j<3; j++){
                matriz[i][j] = r.nextInt(101);
            }
        }
        System.out.println("Matriz gerada: ");
        for (int i = 0; i< 3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
        
        for (int i =0; i<3; i++){
            int somaL1 = matriz[i][0]+matriz[i][1]+matriz[i][2];
            System.out.println("Soma da " +(i + 1) + "a linha: " +somaL1);
        }
        for (int j=0; j<3; j++){
            int somaC1 = matriz[0][j]+matriz[1][j]+matriz[2][j];
            System.out.println("Soma da " +(j + 1) + "a coluna: " +somaC1);
        }
        
//        int somaL1 = matriz[0][0]+matriz[0][1]+matriz[0][2];
//        int somaL2 = matriz[1][0]+matriz[1][1]+matriz[1][2];
//        int somaL3 = matriz[2][0]+matriz[2][1]+matriz[2][2];
//        
//        int somaC1 = matriz[0][0]+matriz[1][0]+matriz[2][0];
//        int somaC2 = matriz[0][1]+matriz[1][1]+matriz[2][1];
//        int somaC3 = matriz[0][2]+matriz[1][2]+matriz[2][2];
//        
//        System.out.println(" ");
//        
//        System.out.println("Soma da 1a linha: " +somaL1);
//        System.out.println("Soma da 2a linha: " +somaL2);
//        System.out.println("Soma da 3a linha: " +somaL3);
//        
//        System.out.println(" ");
//        System.out.println("Soma da 1a coluna: " +somaC1);
//        System.out.println("Soma da 2a coluna: " +somaC2);
//        System.out.println("Soma da 3a coluna: " +somaC3);
        
    }
}
