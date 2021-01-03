package com.toy.anagrams.lib;

import javax.swing.JOptionPane;

public class NewClass2 {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base: "));
        double raiz = Double.parseDouble(JOptionPane.showInputDialog("Digite a raiz: "));
        double resultado = Math.pow(base, 1/raiz);
        JOptionPane.showMessageDialog(null,"Raiz deu: "+resultado);
    }
}
