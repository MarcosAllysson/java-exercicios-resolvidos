
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoda
 */
public class Escolha {
    public static void main(String[] args) {
        String[] opcoes = {"Barato", "Médio", "Caro"};
        int opcao = JOptionPane.showOptionDialog(null, "Escolha um produto", "Janela de escolha", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if(opcao == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Produto custa R$ 0,34.");
        } else if(opcao == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Produto custa R$ 5,90.");
        } else if(opcao == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Produto custa R$ 10.990,00.");
        }
    }
}
