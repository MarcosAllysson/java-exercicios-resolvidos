/*Questão 7: [4.0 pontos] Escreva um programa que calcule o fatorial de um número. */
package lista03_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao_07 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog(null,"De qual número você quer calcular fatorial? ");
        int n1 = Integer.parseInt(num);
        
        int fat = 1;
        for (int i=n1; i>=1; i--){
            fat *= i; 
        } JOptionPane.showMessageDialog(null,"Fatorial de !" +n1+ " é = " +fat);
    }
}
