//Exemplo dos slides

package com.toy.anagrams.lib;

import javax.swing.JOptionPane;

public class NewClass {
    public static void main(String[] args) {
        double qntIniSub;
        double taxaDesin;
        double tempo;
        double qntSobrou;
        String questao;
        
        // Q = Qo x e elevado -rt
        questao = JOptionPane.showInputDialog(null, "Massa inicial? ");
        qntIniSub = Double.parseDouble(questao);
        
        questao = JOptionPane.showInputDialog(null, "Taxa de desintegraçã? ");
        taxaDesin = Double.parseDouble(questao);
        
        questao = JOptionPane.showInputDialog(null, "Tempo? ");
        tempo = Double.parseDouble(questao);
        
        double nova = (-taxaDesin*tempo);
        qntSobrou = qntIniSub * Math.exp(nova);
        // q = q0 * Math.pow(Math.E -r*t)
        System.out.println(qntSobrou+ " gramas da substância.");
    } 
}
