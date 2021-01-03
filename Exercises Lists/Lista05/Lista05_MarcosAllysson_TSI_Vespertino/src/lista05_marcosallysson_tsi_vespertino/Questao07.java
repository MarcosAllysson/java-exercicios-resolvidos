/*Questao 7: [4.0 pontos] Implemente o jogo: 
Adivinhe o Numero. As regras do jogo sao as seguintes:
O computador escolhe um numero aleatorio inteiro entre 0 e 100.
O jogador deve sugerir um numero,
se ele acertar, o computador avisa que ele acertou e mostra quantas tentativas foram feitas; 
caso ele nao acerte o numero, o computador deve dizer se o numero aleatorio é maior ou menor que o
numero sugerido e permitir que o usuario faca novas sugestoes. */
package lista05_marcosallysson_tsi_vespertino;

import java.util.Random;
import javax.swing.JOptionPane;

public class Questao07 {
    public static void main(String[] args) {
        int tentativa = 0;
        int magicoSugerido;
        
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(101);
        
        do {
            String sugestao = JOptionPane.showInputDialog(">>>> ADIVINHE O NÚMERO <<<< \n\nEscolha número entre 0 - 100 : ");
            magicoSugerido = Integer.parseInt(sugestao);
           
            if(numeroAleatorio > magicoSugerido){
            JOptionPane.showMessageDialog(null,"Número mágico é maior que o teu. Vamos de novo?");
            }
            else if (numeroAleatorio < magicoSugerido) {
            JOptionPane.showMessageDialog(null,"Número mágico é menor que o teu. Vamos de novo?");
            }
            tentativa++;
            if (magicoSugerido == numeroAleatorio){
            JOptionPane.showMessageDialog(null,"VOCÊ ACERTOU CAMPEÃO |(^o^)/ \n\n Tentativas: "+tentativa);
            }
        } while(magicoSugerido != numeroAleatorio);
    }
}
