/*Questão 6: [2.0 pontos] Escreva um programa que receba dois números e os apresente em ordem crescente
(o menor primeiro e depois o maior).
 */
package lista_02_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao_06 {
    public static void main(String[] args) {
        float n1,n2;
        String val;
        
        val = JOptionPane.showInputDialog("Insira primeiro valor: ");
        n1 = Float.parseFloat(val);
        val = JOptionPane.showInputDialog("Insira segundo valor: ");
        n2 = Float.parseFloat(val);
        
        if (n1>n2){
            JOptionPane.showMessageDialog(null,+n2+ "\n" +n1);
        } else {
            JOptionPane.showMessageDialog(null, +n1+ "\n" +n2);
        }
        
    }
}
