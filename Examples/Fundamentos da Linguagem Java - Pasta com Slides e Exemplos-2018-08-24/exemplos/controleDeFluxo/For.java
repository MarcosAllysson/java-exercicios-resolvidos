
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoda
 */
public class For {
    
    public static void main(String[] args) {
        int quantidade;
        String texto = JOptionPane.showInputDialog("Quantos números devem ser impressos?\n");
        quantidade = Integer.parseInt(texto);
        for(int i = 1; i <= quantidade; i++) {
            System.out.println(i);
        }
    }
}
