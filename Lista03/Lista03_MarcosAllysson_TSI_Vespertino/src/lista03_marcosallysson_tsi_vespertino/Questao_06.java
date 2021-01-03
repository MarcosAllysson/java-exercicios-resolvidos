/*Questão 6: [2.5 pontos] Escreva um programa que receba três números e os apresente em ordem crescente
(o menor primeiro, então o mediano e depois o maior). */
package lista03_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao_06 {
    public static void main(String[] args) {
        double n1,n2,n3;
        String num;
        
        num = JOptionPane.showInputDialog(null,"Insira primeiro número: ");
        n1 = Double.parseDouble(num);
        num = JOptionPane.showInputDialog(null,"Insira segundo número: ");
        n2 = Double.parseDouble(num);
        num = JOptionPane.showInputDialog(null,"Insira terceiro número: ");
        n3 = Double.parseDouble(num);
        
        if ((n1 < n2) && (n2 < n3) && (n1 < n3)){
            JOptionPane.showMessageDialog(null,"Ordem Crescente: " +n1+ " ," +n2+ " e " +n3);
        }
        else if ((n1 < n2) && (n3 < n2) && (n1 < n3)){
            JOptionPane.showMessageDialog(null,"Ordem Crescente: " +n1+ " ," +n3+ " e " +n2);
        }
        else if ((n2 < n1) && (n1 < n3) && (n2 < n3)){
            JOptionPane.showMessageDialog(null,"Ordem Crescente: " +n2+ " ," +n1+ " e " +n3);
        }
        else if ((n2 < n1) && (n3 < n1) && (n2 < n3)){
            JOptionPane.showMessageDialog(null,"Ordem Crescente: " +n2+ " ," +n3+ " e " +n1);
        }
        else if ((n3 < n2) && (n2 < n1) && (n3 < n1)){
            JOptionPane.showMessageDialog(null,"Ordem Crescente: " +n3+ " ," +n2+ " e " +n1);
        }
        else if ((n3 < n2) && (n1 < n2) && (n3 < n1)){
            JOptionPane.showMessageDialog(null,"Ordem Crescente: " +n3+ " ," +n1+ " e " +n2);
        }
    }
}
