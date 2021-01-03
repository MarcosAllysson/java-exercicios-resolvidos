package exemplos20180927;

import javax.swing.JOptionPane;



public class Recursividade1 {

    public int fatorial(int n) {
        // Caso Base
        if(n <=1) {
            return 1;
        // Relação de Recorrência
        } else {
            return n*fatorial(n-1);
        }
    }
    
    
    
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Entre o número:"));
        Recursividade1 rec = new Recursividade1();
        int fat = rec.fatorial(n);
        JOptionPane.showMessageDialog(null, "O fatorial de "+n+" é: "+fat);
    }
}
