
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoda
 */
public class ExpressaoCondicional {
    
    public static void main(String[] args) {
        double valor;
        double resposta;
        String texto = JOptionPane.showInputDialog("Insira um número, se for abaixo de 1, será apresentado 1000 vezes o seu valor, senão, será apresentado o valor dividido por 1000.\n");
        valor = Double.parseDouble(texto);
        resposta = (valor < 1) ? 1000*valor : valor/1000;
        JOptionPane.showMessageDialog(null, "A resposta é: " + resposta);
    }
}
