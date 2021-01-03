
import javax.swing.JOptionPane;

public class LeNumero {

    public static void main(String[] args) {
        String variavel = JOptionPane.showInputDialog("Entre um número:");
        int numero = Integer.parseInt(variavel);
        JOptionPane.showMessageDialog(null, "O número inserido foi "+numero);
    }
}
