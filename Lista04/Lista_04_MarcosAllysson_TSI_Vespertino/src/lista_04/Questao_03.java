/*Questão 3: [2.5 pontos] Escreva um programa que receba do usuario um número n e outro p e calcule
o arranjo n, p a p.
An,p =  n! / (n − p)!
 */
package lista_04;

import javax.swing.JOptionPane;

public class Questao_03 {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Digite valor para n: ");
        int n = Integer.parseInt(n1);
        String n2 = JOptionPane.showInputDialog("Digite valor para p: ");
        int p = Integer.parseInt(n2);        
    
        int nFatorial = 1;
        for (int i=n; i>=1; i--){
            nFatorial *= i;
        }
        
        int sub = n - p;
        int subFatorial = 1;
        for (int j = sub; j >= 1; j--){
            subFatorial *= j;
        }
        
        float respostaFatorial = nFatorial / subFatorial;
        
        JOptionPane.showMessageDialog(null,"An,p = " +n+ "! / (" +n+ " - " +p+ ") !, é igual a: " +respostaFatorial);
        
    }
}
