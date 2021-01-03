
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoda
 */
public class IfElse {
    
    public static void main(String[] args) {
        int tamanho;
        String tamanhoTexto = JOptionPane.showInputDialog("Qual o tamanho do sapato?\n");
        tamanho = Integer.parseInt(tamanhoTexto);
        if(tamanho < 25) {
            JOptionPane.showMessageDialog(null,"É um sapato infantil.\n");
        } else if(tamanho > 42) {
            JOptionPane.showMessageDialog(null,"É um sapato grande.\n");
        } else if(tamanho < 36) {
            JOptionPane.showMessageDialog(null,"É um sapato pequeno.\n");
        } else {
            JOptionPane.showMessageDialog(null,"É um sapato mediano.\n");
        }
    }
}
