/*Questão 3 
Escreva um programa que receba dois números e os apresente na ordem inversa
`a sua inserção (O que foi inserido por último apareça primeiro). */
package exerciciolista01;

import javax.swing.JOptionPane;

public class Questao_3 {
    public static void main(String[] args) {
        float n1, n2;
        String dados;
        
        dados = JOptionPane.showInputDialog("Escreva primeiro número: ");
        n1 = Integer.parseInt(dados);
        dados = JOptionPane.showInputDialog("Escreva segundo número: ");
        n2 = Integer.parseInt(dados);
        
        System.out.println("Segundo número: " +n2);
        System.out.println("Primeiro número: " +n1);
    }
}
