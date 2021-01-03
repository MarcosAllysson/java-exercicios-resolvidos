/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_0816;

import javax.swing.JOptionPane;

/**
 *
 * @author yoda
 */
public class MenuBunitinhoComGambiarra {
    public static void main(String[] args) {
        String[] opcoes = {"Cumprimento", "Elogio", "Despedida", "Interjeição", "Xingamento"};
        int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu Bunitinho", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
        if(opcao == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Boa tarde!");
        } else if(opcao == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Parabéns!");
        } else if(opcao == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Tchau!");
        } else if(opcao == JOptionPane.CANCEL_OPTION+1) {
            JOptionPane.showMessageDialog(null, "Caramba!");
        } else if(opcao == JOptionPane.CANCEL_OPTION+2) {
            JOptionPane.showMessageDialog(null, "FDP!");
        }
    }
}
