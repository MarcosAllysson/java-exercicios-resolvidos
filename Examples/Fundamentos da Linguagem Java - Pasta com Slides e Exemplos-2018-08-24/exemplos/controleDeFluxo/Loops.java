
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoda
 */
public class Loops {
    
    public static void main(String[] args) {
        int quantidade;
        String texto = JOptionPane.showInputDialog("Quantos números devem ser apresentados?\n");
        quantidade = Integer.parseInt(texto);
        for(int i = 0; i < 1000; i++) {
            System.out.print(i);
            if(i == quantidade) {
                break;
            }
            if((i%3) == 1) {
                System.out.print(":\tO resto de "+i+" por 3 é 1.");
            } else if((i%3) == 2) {
                System.out.print(":\tO resto de "+i+" por 3 é 2.");
            } else if((i%3) == 0) {
                System.out.println(":\tO resto de "+i+" por 3 é 0.");
                continue;
            }
            System.out.println("\t"+i+" não é divisível por 3.");
        }
    }
}
