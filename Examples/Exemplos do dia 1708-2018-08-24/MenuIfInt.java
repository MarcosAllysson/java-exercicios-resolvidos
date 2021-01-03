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
public class MenuIfInt {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma opção:\n\n1 - Cumprimento\n2 - Elogio\n3 - Despedida");
        int opcao = Integer.parseInt(texto);
        if(opcao == 1) {
            System.out.println("Boa tarde!");
        } else if (opcao == 2) {
            System.out.println("Parabéns!");
        } else if (opcao == 3) {
            System.out.println("Tchau!");
        } else { // Opcional
            System.out.println("Opção inválida.");
        }
    }
}













