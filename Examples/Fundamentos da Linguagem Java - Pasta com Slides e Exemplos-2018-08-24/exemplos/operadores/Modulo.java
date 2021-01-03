
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yoda
 */
public class Modulo {
    public static void main(String[] args) {
        String textoDividendo;
        String textoDivisor;
        int dividendo;
        int divisor;
        int quociente;
        int resto;

        textoDividendo = JOptionPane.showInputDialog("Insira o dividendo:");
        textoDivisor = JOptionPane.showInputDialog("Insira o divisor:");
        dividendo = Integer.parseInt(textoDividendo);
        divisor = Integer.parseInt(textoDivisor);

        quociente = dividendo / divisor;
        resto = dividendo % divisor;

        JOptionPane.showMessageDialog(null, "A divisão de "+dividendo+" por "+divisor+" tem quociente: "+quociente+" e resto: "+resto+".");
    }
}
