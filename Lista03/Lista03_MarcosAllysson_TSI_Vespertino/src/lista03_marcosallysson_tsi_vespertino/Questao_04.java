/*Questão 4: [1.5 ponto] Escreva um programa que receba um número e informe se ele é par ou ímpar. */
package lista03_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao_04 {
    public static void main(String[] args) {
        double num;
        String val;
        
        val = JOptionPane.showInputDialog(null,"Insira um número qualquer: ");
        num = Double.parseDouble(val);
        
        if (num % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número " +num+ " é par!");
        } else {
            JOptionPane.showMessageDialog(null,"O número " +num+ " é ímpar!");
        }
    }
}
