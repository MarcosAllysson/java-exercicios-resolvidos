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
public class MenuIfChar {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma opção:\n\nC - Cumprimento\nE - Elogio\nD - Despedida");
        char opcao = texto.charAt(0);
        opcao = Character.toUpperCase(opcao);
        if(opcao == 'C') {
            System.out.println("Boa tarde!");
        } else if (opcao == 'E') {
            System.out.println("Parabéns!");
        } else if (opcao == 'D') {
            System.out.println("Tchau!");
        } else { // Opcional
            System.out.println("Opção inválida.");
        }
    }
}
