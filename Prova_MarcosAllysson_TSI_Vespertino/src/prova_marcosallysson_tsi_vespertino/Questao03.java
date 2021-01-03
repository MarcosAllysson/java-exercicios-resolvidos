/*Questão 3: [4.0 pontos] Escreva um programa que auxilie na venda de ingressos para os jogos do Campeonato
Brasiliense de Futebol. O programa deve permitir ao usuário a seleção de uma dentre as
três categorias: classe A: R$ 500,00; classe B: R$ 200,00; classe C: R$ 60,00. Deve permitir também
ao usuário determinar quantos ingressos ele deseja à meia entrada e quantos ele deseja à inteira.
Após o usuário fazer as escolhas, o programa deve calcular e apresentar o valor que o usuário deverá
pagar pelos ingressos solicitados.
 */
package prova_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao03 {
    public static void main(String[] args) {
        String opcao;
        String pergunta1;
        String pergunta2;
        int escolha = 1;
        int meia, inteira;
        float valorMeia, valorInteira, valorTotal;
        
        do {
            opcao = JOptionPane.showInputDialog("Escolha uma opção: \n\n (1) Classe A \n (2) Classe B \n (3) Classe C \n (0) Digite 0 para sair");
            escolha = Integer.parseInt(opcao);
            
            if (escolha == 1){
                pergunta1 = JOptionPane.showInputDialog("Você escolheu classe A, cada ingresso custa R$ 500. \n Gostaria de quantas meias? ");
                meia = Integer.parseInt(pergunta1);
                valorMeia = (500 / 2) * meia;
                            
                pergunta2 = JOptionPane.showInputDialog("Quantas inteiras?");
                inteira = Integer.parseInt(pergunta2);
                valorInteira = 500 * inteira;
                    
                valorTotal = valorMeia + valorInteira;
                JOptionPane.showMessageDialog(null,"Valor total a ser pago: R$" + valorTotal);
            }   
            
            else if (escolha == 2){
                pergunta1 = JOptionPane.showInputDialog("Você escolheu classe B, cada ingresso custa R$ 200. \n Gostaria de quantas meias? ");
                meia = Integer.parseInt(pergunta1);
                valorMeia = (200 / 2) * meia;
                            
                pergunta2 = JOptionPane.showInputDialog("Quantas inteiras?");
                inteira = Integer.parseInt(pergunta2);
                valorInteira = 200 * inteira;
                    
                valorTotal = valorMeia + valorInteira;
                JOptionPane.showMessageDialog(null,"Valor total a ser pago: R$" + valorTotal);
            }
            
            else if (escolha == 3){
                pergunta1 = JOptionPane.showInputDialog("Você escolheu classe C, cada ingresso custa R$ 60. \n Gostaria de quantas meias? ");
                meia = Integer.parseInt(pergunta1);
                valorMeia = (60 / 2) * meia;
                            
                pergunta2 = JOptionPane.showInputDialog("Quantas inteiras?");
                inteira = Integer.parseInt(pergunta2);
                valorInteira = 60 * inteira;
                    
                valorTotal = valorMeia + valorInteira;
                JOptionPane.showMessageDialog(null,"Valor total a ser pago: R$" + valorTotal);
            }
            
            else if (escolha == 0){
                JOptionPane.showMessageDialog(null,"Saindo... \n Até mais!");
            }
            
            else if (escolha > 3 ){
                JOptionPane.showMessageDialog(null,"Opção escolhida inválida. Por gentileza, verifique e tente novamente!");
            }
 
        } while (escolha != 0);
    }
}
