/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Aluno
 */
public class ExemploDado extends JFrame{
    BotaoDado botao;
    public ExemploDado(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        botao = new BotaoDado();
        add(botao);
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botao.valor++;
                if (botao.valor == 10){
                    botao.valor = 0;
                }
                botao.repaint();
            }
        });
    }
    
    public static void main(String[] args) {
        ExemploDado janela = new ExemploDado();
        janela.setSize(500, 520);
        janela.setVisible(true);
    }
}

class BotaoDado extends JButton {
    int valor;
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.black);
        if (valor == 1){
            g.fillArc(200,200,100,100,0,360);
        }
        else if (valor == 2){
            g.fillArc(200,200,100,100,0,360);
        }
        else if (valor == 3){
            g.fillArc(200,200,100,100,0,360);
        }
        else if (valor == 4){
            g.fillArc(200,200,100,100,0,360);
        }
        else if (valor == 5){
            g.fillArc(200,200,100,100,0,360);
        }
        else if (valor == 6){
            g.fillArc(200,200,100,100,0,360);
        }
        else if (valor == 7){
            g.fillArc(200,200,100,100,0,360);
        }
        else if (valor == 8){
            g.fillArc(200,200,100,100,0,360);
        }
        else if (valor == 9){
            g.fillArc(200,200,100,100,0,360);
        }
    }
}