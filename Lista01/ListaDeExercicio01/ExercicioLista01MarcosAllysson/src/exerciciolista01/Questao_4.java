/*Escreva um programa que receba um numero inteiro e depois informe se ele é
maior ou menor que 10. */
package exerciciolista01;

import javax.swing.JOptionPane;

public class Questao_4 {
    public static void main(String[] args) {
        int numero;
        String number;
        
        number = JOptionPane.showInputDialog("Insira um número: ");
        numero = Integer.parseInt(number);
        
        if (numero > 10){
            System.out.println("Número inserido é maior que 10!");
        } else {
            System.out.println("Número inserido é menor que 10!");
        }
    }
}
