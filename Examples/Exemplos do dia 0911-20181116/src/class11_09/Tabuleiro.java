/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos20181109;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author yoda
 */
public class Tabuleiro extends JFrame {
    JPanel barraDeFerramentas;
    JButton botaoNovo;
    JButton botaoAbrir;
    JButton botaoSalvar;
    JButton botaoAjuda;
    JLabel barraDeStatus;
    JPanel painelTabuleiro;
    JButton[][] botoes;
    
    public Tabuleiro() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        barraDeFerramentas = new JPanel(new FlowLayout(FlowLayout.LEFT));
        add(barraDeFerramentas, BorderLayout.NORTH);
        botaoNovo = new JButton("Novo");
        barraDeFerramentas.add(botaoNovo);
        botaoAbrir = new JButton("Abrir");
        barraDeFerramentas.add(botaoAbrir);
        botaoSalvar = new JButton("Salvar");
        barraDeFerramentas.add(botaoSalvar);
        botaoAjuda = new JButton("Ajuda");
        barraDeFerramentas.add(botaoAjuda);
        barraDeStatus = new JLabel("É a vez do jogador das peças brancas.");
        add(barraDeStatus, BorderLayout.SOUTH);
        painelTabuleiro = new JPanel(new GridLayout(8, 8));
        add(painelTabuleiro, BorderLayout.CENTER);
        botoes = new JButton[8][8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                botoes[i][j] = new JButton();
                painelTabuleiro.add(botoes[i][j]);
                if((i+j)%2 == 0) {
                    botoes[i][j].setBackground(Color.BLACK);
                } else {
                    botoes[i][j].setBackground(Color.WHITE);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Tabuleiro janela = new Tabuleiro();
        janela.setSize(500, 520);
        janela.setVisible(true);
    }
}
