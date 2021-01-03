/*Questão 3: [2.0 pontos] Escreva um programa que receba um tempo em segundos e apresente-o no
formato de horas, minutos e segundos. (Exemplo: Receba 5492 (segundos) e apresente 1 hora, 31
minutos e 32 segundos.) */
package lista05_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao03 {
    public static void main(String[] args) {
        int hora=0;
        int minutos;
        int segundos=0;
        int recebido;
        String pergunta;
        
        pergunta = JOptionPane.showInputDialog("Quantos segundos? ");
        recebido = Integer.parseInt(pergunta);
        
        // segundos:
        if (recebido < 60){
            segundos = recebido;
        }
        else if (recebido % 60 != 0){ //pegar resto da divisão para pegar os segundos
            int resto = recebido % 60; // segundos recebe resto da divisão
            segundos = resto;
        }
        //minutos:        
        minutos = recebido / 60;
        if (minutos > 60){
            hora = minutos / 60;
            minutos %= 60;
        }
        JOptionPane.showMessageDialog(null, "HORA: \n\n" +hora + " h " +minutos+ " min " +segundos+ " s");
    }
}
