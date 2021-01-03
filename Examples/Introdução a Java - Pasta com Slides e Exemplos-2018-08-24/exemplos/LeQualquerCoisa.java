import javax.swing.JOptionPane;

public class LeQualquerCoisa {

    public static void main(String[] args) {
        String caracteres = JOptionPane.showInputDialog("Qual a cor do cavalo branco de Napoleão?");
        JOptionPane.showMessageDialog(null, "A cor do cavalo branco de Napoleão é "+caracteres);
    }
    
}