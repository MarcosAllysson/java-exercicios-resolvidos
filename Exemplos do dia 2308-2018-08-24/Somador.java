/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos20180823;

import javax.swing.JOptionPane;

/**
 * 2 1 5 4 7 8 1 2 3 9
 * @author yoda
 */
public class Somador {
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 1; i <= 10; i++) {
            String texto = JOptionPane.showInputDialog("Insira o próximo número:");
            int numero = Integer.parseInt(texto);
            soma = soma+numero;
        }
        JOptionPane.showMessageDialog(null, "a soma deu "+soma);
    }
}
