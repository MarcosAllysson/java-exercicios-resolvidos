package com.toy.anagrams.lib;

import javax.swing.JOptionPane;

public class NewClass3 {
    public static void main(String[] args) {
        // d = Vo elevado 2 x sen (2'O') /9
        // h = Vo elevado 2 x sen elevado 2 ('O') / 2g
        double velLan;
        double angLan;
        double altMaxAtin;
        double disMaxAtin;
        double gra = 10;
        // gravidade 10 m/s elevado 2
        // D distância
        // H altura
        // Vo velocidade de lançamento, O -> ângulo de lançamento, g -> aceleração gravidade
        String vellan = JOptionPane.showInputDialog("Velocidade inicial: ");
        velLan = Double.parseDouble(vellan);
        String anglan = JOptionPane.showInputDialog("Angulo inicial: ");
        angLan = Double.parseDouble(anglan);
        
        double radianos = Math.toRadians(angLan);
         disMaxAtin = velLan * velLan * Math.sin(2*radianos) / gra;
         altMaxAtin = velLan * velLan * Math.pow(Math.sin(radianos),2) / (2*gra);
//        double altmaxAting = velLan * Math.sin(2 * angLan) / gra;
        //double disMaxAtin = velLan * (angLan*angLan * angLan / 2*gra;
        System.out.println(disMaxAtin);
        System.out.println(altMaxAtin);
//     
        
    }
}
