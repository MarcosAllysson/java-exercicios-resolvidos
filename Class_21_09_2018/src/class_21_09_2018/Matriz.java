/* Exemplo de matriz  */
package class_21_09_2018;

import javax.swing.JOptionPane;

public class Matriz {
    public static void main(String[] args) {
        int [][] matriz = new int [4][3];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j+=1){
                String texto = JOptionPane.showInputDialog("Digite o próximo valor: ");
                matriz[i][j] = Integer.parseInt(texto);
            }
        } 
        System.out.println("Matriz digitada: ");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j+=1){
                System.out.print(matriz[i][j] + " \t"); // \t -> tabular, faz com que seja exibido de uma forma mais organizada
            }
            System.out.println(""); // para não emendar um número no outro
        }
    }
    
}   
