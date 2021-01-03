
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoda
 */
public class DoWhile {
    
    public static void main(String[] args) {
        String[] opcoes = {"Sim", "Não"};
        int opcao;
        do {
            opcao = JOptionPane.showOptionDialog(null, "Está no laço. Repetir?", "Do While", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        } while(opcao == JOptionPane.YES_OPTION);
    }
}
