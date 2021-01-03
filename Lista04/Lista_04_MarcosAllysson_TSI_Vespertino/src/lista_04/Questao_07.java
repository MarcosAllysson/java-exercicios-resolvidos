/*Questão 7: [5.0 pontos] Escreva um programa que receba um número e determine se ele é primo ou não. */
package lista_04;

import javax.swing.JOptionPane;

public class Questao_07 {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Insira número: ");
        int primoOuNao = Integer.parseInt(numero);
        int divididoPor = 0;
        
        for (int i = 1; i<= primoOuNao; i++){
            if (primoOuNao % i == 0){
                divididoPor += 1;
            }
        }
        if (divididoPor == 2){
            JOptionPane.showMessageDialog(null,"O número " +primoOuNao+ " é primo!");
        }
        else {
            JOptionPane.showMessageDialog(null,"O número " +primoOuNao+ " não é primo!");
        }
    }
}

