
package class11_09;

import javax.swing.*;
import java.awt.*;

public class Tabuleiro extends JFrame{
    JPanel barradeFerramentas;
    JButton botaoNovo;
    JButton botaAbrir;
    JButton botaoSalvar;
    JButton botaoAjuda;
    JLabel barraDeStatus;
    JPanel painelTabuleiro;
    JButton[][] botoes;
    
    public Tabuleiro(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        barradeFerramentas = new JPanel(new FlowLayout(FlowLayout.LEFT));
        add(barradeFerramentas, BorderLayout.NORTH);
        botaoNovo = new JButton("Novo");
        barradeFerramentas.add(botaoNovo);
        botaAbrir = new JButton("Abrir");
        barradeFerramentas.add(botaAbrir);
        botaoSalvar = new JButton("Salvar");
        barradeFerramentas.add(botaoSalvar);
        botaoAjuda = new JButton("Ajuda");
        barradeFerramentas.add(botaoAjuda);
        barraDeStatus = new JLabel("É a sua vez de jogar...");
        add(barraDeStatus, BorderLayout.SOUTH);
        painelTabuleiro = new JPanel(new GridLayout(8, 8));
        add(painelTabuleiro, BorderLayout.CENTER);
        botoes = new JButton[8][8];
        for (int i =0; i<8; i++){
            for (int j=0; j<8; j++){
                botoes[i][j] = new JButton();
                painelTabuleiro.add(botoes[i][j]) ;
                if ((i+j)%2 == 0){
                    botoes[i][j].setBackground(Color.BLACK);
                } else {
                    botoes[i][j].setBackground(Color.WHITE);
                }
                
            }
        }
//        botoes[0][0].setBackground(new Color(0, 0, 255));
//        botoes[0][1].setBackground(new Color(255, 0, 0));
        //132, 245, 249 -- light blue color
                
        
                
        
    }
    
    public static void main(String[] args) {
        Tabuleiro janela = new Tabuleiro();
        janela.setSize(500,520);
        janela.setVisible(true);
    }
}
