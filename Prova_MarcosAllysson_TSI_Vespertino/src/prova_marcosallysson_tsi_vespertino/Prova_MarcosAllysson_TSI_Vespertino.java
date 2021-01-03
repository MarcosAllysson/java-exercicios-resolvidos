/*Questão 1: [2.5 pontos] Escreva um programa que receba uma temperatura em graus Fahrenheit e a
converta para Kelvin. A fórmula de conversão está apresentada abaixo:
K = 5 / 9 × (F + 459, 67)
*/
package prova_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Prova_MarcosAllysson_TSI_Vespertino {

    public static void main(String[] args) {
        String grau = JOptionPane.showInputDialog("Temperatura em Fahrenheit? ");
        double fah = Double.parseDouble(grau);
        
        double kelvin;
        
        //K = 5 / 9 * (fah + 459.67)
        kelvin =  (double) 5 / 9 * (fah + 459.67);
        
        JOptionPane.showMessageDialog(null, fah+ " Fahrenheit, para Kelvin, é igual a: " +kelvin);
        
    }
    
}
