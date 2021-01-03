/*Questão 5: [1.5 ponto] Escreva um programa que receba dois números e calcule sua soma, sua diferença,
seu produto e sua razão.
 */
package lista_02_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao_05 {
    public static void main(String[] args) {
        float n1, n2;
        String numbers;
        
        numbers = JOptionPane.showInputDialog("Qual primeiro número?");
        n1 = Float.parseFloat(numbers);
        numbers = JOptionPane.showInputDialog("Qual segundo número?");
        n2 = Float.parseFloat(numbers);
        
        float soma = n1 + n2;
        float diferenca = n1 - n2;
        float produto = n1 * n2;
        float razao = n1 / n2;
        
        JOptionPane.showMessageDialog(null,"Soma:  "+soma+ "\n Diferença:  "+diferenca+ "\n Produto:  "+produto+ "\n Razão:  "+razao);
    }
}
