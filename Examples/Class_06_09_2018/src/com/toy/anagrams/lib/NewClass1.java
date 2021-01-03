package com.toy.anagrams.lib;

import javax.swing.JOptionPane;

public class NewClass1 {
    public static void main(String[] args) {
        double angulo = Double.parseDouble(JOptionPane.showInputDialog("Angulo em graus"));
        double radianos = Math.toRadians(angulo);
        double seno = Math.sin(angulo);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);
        JOptionPane.showMessageDialog(null,"Seno: " +seno+ "\nCosseno: " +cosseno+ "\n Tangente: " + tangente);
    }
}
