/*Questao 5: [2.0 pontos] Escreva um programa que receba 10 numeros e, apos, apresente-os em ordem
inversa (O ultimo a ser inserido é o primeiro a ser apresentado). */
package lista05_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao05 {
    public static void main(String[] args) {
        float [] num = new float [10];
        String ask;
        float val;
    
        for (int i=0; i<num.length; i++){
        ask = JOptionPane.showInputDialog("Insira valor: ");
        val = Float.parseFloat(ask);
        num[i] = val;
        }

        for (int i=num.length-1; i>=0; i--){
            System.out.println(num[i]);
        }
        
    }
}
