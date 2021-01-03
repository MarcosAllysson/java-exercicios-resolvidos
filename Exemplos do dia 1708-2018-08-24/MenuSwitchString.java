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
public class MenuSwitchString {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma opção:\n\nCumprimento\nElogio\nDespedida");
        texto = texto.toLowerCase();
        switch(texto) {
            case "cumprimento":
                System.out.println("Boa tarde!");
                break;
            case "elogio":
            System.out.println("Parabéns!");
                break;
            case "despedida":
            System.out.println("Tchau!");
                break;
            default:
            System.out.println("Opção inválida.");
        }
    }
}










