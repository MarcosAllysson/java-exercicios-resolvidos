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
public class Condicionais1 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite um número:");
        int i = Integer.parseInt(texto);
//        if(i == 0) {
//            System.out.println("Nulo");
//        } else if(i < 10) {
//            System.out.println("Unidades");
//        } else if(i < 100) {
//            System.out.println("Dezenas");
//        } else if(i < 1000) {
//            System.out.println("Centenas");
//        } else {
//            System.out.println("Número Grande.");
//        }
        if(i == 0) {
            System.out.println("Nulo");
        } if(i < 10) {
            System.out.println("Unidades");
        } if(i < 100) {
            System.out.println("Dezenas");
        } if(i < 1000) {
            System.out.println("Centenas");
        } else {
            System.out.println("Número Grande.");
        }
        System.out.println("Resto do Programa.");
    }
}















