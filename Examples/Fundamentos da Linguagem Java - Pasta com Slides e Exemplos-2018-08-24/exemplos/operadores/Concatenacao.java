
import java.awt.Point;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoda
 */
public class Concatenacao {
    public static void main(String[] args) {
        String texto1;
        String texto2;
        String textoNumerico;
        int numero;
        Point point;
        Random random;
        
        point = new Point(10, 15);
        random = new Random();
        
        String textoConcatenado;
        String numeroConcatenado;
        String objetoConcatenado1;
        String objetoConcatenado2;
        
        texto1 = JOptionPane.showInputDialog("Insira o primeiro texto:");
        texto2 = JOptionPane.showInputDialog("Insira o segundo texto:");
        textoNumerico = JOptionPane.showInputDialog("Insira o numero:");
        numero = Integer.parseInt(textoNumerico);

        textoConcatenado = texto1 + texto2;
        numeroConcatenado = texto1 + numero;
        objetoConcatenado1 = texto1 + point;
        objetoConcatenado2 = texto1 + random;

        JOptionPane.showMessageDialog(null, "Texto concatenado: "+textoConcatenado);
        JOptionPane.showMessageDialog(null, "Número concatenado: "+numeroConcatenado);
        JOptionPane.showMessageDialog(null, "Objeto concatenado: "+objetoConcatenado1);
        JOptionPane.showMessageDialog(null, "Objeto concatenado: "+objetoConcatenado2);
    }
    
}
