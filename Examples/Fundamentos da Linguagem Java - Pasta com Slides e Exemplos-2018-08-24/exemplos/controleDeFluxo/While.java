
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoda
 */
public class While {
    public static void main(String[] args) {
        int quantidade;
        String texto = JOptionPane.showInputDialog("Quantos pontos devem ser impressos? (experimente inserir zero)\n");
        quantidade = Integer.parseInt(texto);
        while(quantidade-- > 0) {
            System.out.println(".");
        }
    }
}
