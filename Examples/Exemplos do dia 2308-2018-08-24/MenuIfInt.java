/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos20180823;

import javax.swing.JOptionPane;

/**
 *
 * @author yoda
 */
public class MenuIfInt {
    public static void main(String[] args) {
        int opcao;
        do {
            String texto = JOptionPane.showInputDialog("Digite uma opção:\n\n1 - Cumprimento\n2 - Elogio\n3 - Despedida\n4 - Sair");
            opcao = Integer.parseInt(texto);
            if(opcao == 1) {
                System.out.println("Boa tarde!");
            } else if (opcao == 2) {
                System.out.println("Parabéns!");
            } else if (opcao == 3) {
                System.out.println("Tchau!");
            } else if (opcao != 4) { // Opcional
                System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }
}













