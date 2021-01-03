/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos20180817;

import javax.swing.JOptionPane;

/**
 *
 * @author yoda
 */
public class Condicionais3 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite um número:");
        int i = Integer.parseInt(texto);
        switch(i) {
            case 0:
                System.out.println("Nulo");
                break;
            case 1:
                System.out.println("Unitário");
                break;
            case 2:
                System.out.println("Dupla");
                break;
            case 3:
                System.out.println("Trio");
                break;
            default:
                System.out.println("Múltiplos");
        }
        System.out.println("Resto do Programa.");
    }
}
