/*Escreva um programa que receba dois números inteiros e depois calcule a diferença
entre eles.*/
package exerciciolista01;

import javax.swing.JOptionPane;

public class Questao_5 {
    public static void main(String[] args) {
        int n1, n2, resultado;
        String numbers;
        
        numbers = JOptionPane.showInputDialog("Escreva o primeiro número: ");
        n1 = Integer.parseInt(numbers);
        numbers = JOptionPane.showInputDialog("Escreva o seguro número: ");
        n2 = Integer.parseInt(numbers);
        
        resultado = n1 - n2;
        System.out.println("A diferença entre os números é: " +resultado);
    }
}
