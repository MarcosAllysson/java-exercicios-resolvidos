package exemplos20181108;

import java.util.Random;
import javax.swing.JOptionPane;

public class AdvinheONumero {
    public static void main(String[] args) {
        Random r = new Random();
        int sec = r.nextInt(1001);
        int cont = 0;
        int num;
        do {
            cont++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Qual o número secreto?"));
            if(num == sec) {
                JOptionPane.showMessageDialog(null, "Parabéns!\nVocê acertou na "+cont+" tentativa.");
            } else if(num < sec) {
                JOptionPane.showMessageDialog(null, "O número secreto é maior que "+num);
            } else if(num > sec) {
                JOptionPane.showMessageDialog(null, "O número secreto é menor que "+num);
            }
        } while (num != sec);
    }
}
