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
public class MenuIFString {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma opção:\n\nCumprimento\nElogio\nDespedida");
        if(texto.equalsIgnoreCase("Cumprimento")) {
            System.out.println("Boa tarde!");
        } else if (texto.equalsIgnoreCase("Elogio")) {
            System.out.println("Parabéns!");
        } else if (texto.equalsIgnoreCase("Despedida")) {
            System.out.println("Tchau!");
        } else { // Opcional
            System.out.println("Opção inválida.");
        }
    }
}
