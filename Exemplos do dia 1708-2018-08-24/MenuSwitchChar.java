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
public class MenuSwitchChar {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma opção:\n\nC - Cumprimento\nE - Elogio\nD - Despedida");
        char opcao = texto.charAt(0);
        switch(opcao) {
            case 'C':
            case 'c':
                System.out.println("Boa tarde!");
                break;
            case 'E':
            case 'e':
                System.out.println("Parabéns!");
                break;
            case 'D':
            case 'd':
                System.out.println("Tchau!");
                break;
            default:
               System.out.println("Opção inválida.");
        }
    }
}
