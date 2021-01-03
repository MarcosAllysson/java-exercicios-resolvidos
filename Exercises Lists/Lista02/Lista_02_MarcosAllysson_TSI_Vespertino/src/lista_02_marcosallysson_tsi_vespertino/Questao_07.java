/*Questão 7: [2.5 pontos] Escreva um programa que receba dois números e calcule a o primeiro elevado
ao segundo (operação de exponencial). Obs.: Crie sua própria implementação da operação de
exponenciação, sem utilizar os métodos da classe Math.
 */
package lista_02_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao_07 {
    public static void main(String[] args) {
        int num1,num2;
        String val;
        
        val = JOptionPane.showInputDialog("Entre com primeiro número: ");
        num1 = Integer.parseInt(val);
        val = JOptionPane.showInputDialog("Entre com segundo número: ");
        num2 = Integer.parseInt(val);
        
        int exp = 1;
        for (int i = 1; i<= num2; i++){
            exp *= num1;
        }
        System.out.println(exp);
    }
}
