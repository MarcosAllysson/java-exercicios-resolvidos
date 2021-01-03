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
public class MenuSwitchInt {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma opção:\n\n1 - Cumprimento\n2 - Elogio\n3 - Despedida");
        int opcao = Integer.parseInt(texto);
        switch(opcao) {
            case 1:
                System.out.println("Boa tarde!");
                break;
            case 2:
                System.out.println("Parabéns!");
                break;
            case 3:
                System.out.println("Tchau!");
                break;
            default: // Opcional
                System.out.println("Opção inválida.");
        }
    }
}
