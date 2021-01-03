/* Escreva um programa que receba 10 números e
armazene-os em um array. Depois apresente quais destes numeros
s~ao menores que 10.*/
package class_2808_08_31;

import javax.swing.JOptionPane;

public class Arrays {
    public static void main(String[] args) {
        int[] numeros = new int [10];
        for (int i=0; i<numeros.length; i+=1){
            String val = JOptionPane.showInputDialog("Insira valor: ");
            numeros[i] = Integer.parseInt(val);                        
        } 
        System.out.println("Valores menores que 10: \n");
        for (int i=0; i<numeros.length; i+=1){
            if (numeros[i] < 10){
                System.out.println(" "+numeros[i]);
            }
        }
        
        System.out.println("Valores maiores que 10: \n");
        for (int i=0; i<numeros.length; i+=1){
            if (numeros[i] > 10) {
                System.out.println(" "+numeros[i]);
            }
        }
        
        System.out.println("Quantidade de valores maiores que 10: \n");
        int quantidade = 0;
        for (int i=0; i<numeros.length; i+=1){
            if (numeros[i] > 10){
                quantidade += 1;                
            }
        } System.out.println(quantidade);
    }
}
