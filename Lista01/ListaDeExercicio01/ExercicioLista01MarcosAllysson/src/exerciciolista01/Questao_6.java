/*Escreva um programa que receba dois números inteiros e depois informe se a
diferença entre eles é maior ou menor que 10. */
package exerciciolista01;

import javax.swing.JOptionPane;

public class Questao_6 {
    public static void main(String[] args) {
        int num1, num2, resultado;
        String val;
        
        val = JOptionPane.showInputDialog("Insira primeiro número: ");
        num1 = Integer.parseInt(val);
        val = JOptionPane.showInputDialog("Insira segundo número: ");
        num2 = Integer.parseInt(val);
        
        resultado = num1 - num2;
        if (resultado > 10){
            System.out.println("Diferença maior que 10!");
        } else {
            System.out.println("Diferença menor que 10!");
        }
    }
}
