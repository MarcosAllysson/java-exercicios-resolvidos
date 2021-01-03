/*Questão 4: [2.5 pontos] Escreva um programa que receba do usuario um número n e outro p e calcule
a combinaçã0 n, p a p.
Cn,p = n! / p! * (n − p)!
 */
package lista_04;

import javax.swing.JOptionPane;

public class Questao_04 {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Digite valor para n: ");
        int n = Integer.parseInt(num1);
        String num2 = JOptionPane.showInputDialog("Digite valor para p: ");
        int p = Integer.parseInt(num2);
        
        int nFatorial = 1;
        for (int i = n; i >= 1; i--){
            nFatorial *= i;
        }
        
        int pFatorial = 1;
        for (int j = p; j >= 1; j--){
            pFatorial *= j;
        }
        
        int subtracaoNP = n - p;
        int subFatorial = 1;
        for (int m = subtracaoNP; m >= 1; m--){
            subFatorial *= m;
        }
        
        float respostaCombinacao = nFatorial / (pFatorial * subFatorial);
        JOptionPane.showMessageDialog(null,"Cn,p = " +n+ "! / " +p+ "! * (" +n+ " - " +p+ ") ! é igual a: " +respostaCombinacao);
    }
}
