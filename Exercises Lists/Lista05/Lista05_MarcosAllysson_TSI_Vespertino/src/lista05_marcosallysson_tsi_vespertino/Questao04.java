/*Questão 4: [2.0 pontos] Escreva um programa que peça números ao usuario ate que o usuario insira o
numero 0. O programa deve, entao, apresentar a soma de todos os numeros inseridos antes do 0.  */
package lista05_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao04 {
    public static void main(String[] args) {
        float numero;
        float contador = 0;
        String pergunta;
        
        do {
            pergunta = JOptionPane.showInputDialog("Entre com o valor: \n\n\n Digite 0 para obter a soma.");
            numero = Float.parseFloat(pergunta);
            contador += numero;
            
        } while (numero != 0);
        JOptionPane.showMessageDialog(null,"A soma de todos os números digitados foi: "+contador);
    }
}
