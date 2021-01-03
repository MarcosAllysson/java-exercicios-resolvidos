/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos20180817;

import javax.swing.JOptionPane;

/**
 *
 * @author yoda
 */
public class MenuIFChar2 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma opção:\n\nC - Cumprimento\nE - Elogio\nD - Despedida");
        char opcao = texto.charAt(0);
        if((opcao == 'C')||(opcao == 'c')) {
            System.out.println("Boa tarde!");
        } else if ((opcao == 'E')||(opcao == 'e')) {
            System.out.println("Parabéns!");
        } else if ((opcao == 'D')||(opcao == 'd')) {
            System.out.println("Tchau!");
        } else { // Opcional
            System.out.println("Opção inválida.");
        }
    }
}
