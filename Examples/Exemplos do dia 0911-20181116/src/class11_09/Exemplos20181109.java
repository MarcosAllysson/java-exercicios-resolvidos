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
public class Exemplos20181109 extends JFrame {
    JLabel rotuloSeg;
    JLabel rotuloTer;
    JLabel rotuloQua;
    JLabel rotuloQui;
    JLabel rotuloSex;
    JLabel rotulo08;
    JLabel rotulo10;
    JLabel rotulo14;
    JLabel rotulo16;
    JTextField[][] campos;
     
    public Exemplos20181109() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,6));
        rotuloSeg = new JLabel("Seg");
        rotuloTer = new JLabel("Ter");
        rotuloQua = new JLabel("Qua");
        rotuloQui = new JLabel("Qui");
        rotuloSex = new JLabel("Sex");
        rotulo08 = new JLabel("08:00-10:00");
        rotulo10 = new JLabel("10:00-12:00");
        rotulo14 = new JLabel("14:00-16:00");
        rotulo16 = new JLabel("16:00-18:00");
        campos = new JTextField[4][5];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                campos[i][j] = new JTextField();
            }
        }
        add(new JPanel());
        add(rotuloSeg);
        add(rotuloTer);
        add(rotuloQua);
        add(rotuloQui);
        add(rotuloSex);
        add(rotulo08);
        for(int j = 0; j < 5; j++) {
            add(campos[0][j]);
        }
        add(rotulo10);
        for(int j = 0; j < 5; j++) {
            add(campos[1][j]);
        }
        add(rotulo14);
        for(int j = 0; j < 5; j++) {
            add(campos[2][j]);
        }
        add(rotulo16);
        for(int j = 0; j < 5; j++) {
            add(campos[3][j]);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Exemplos20181109 janela = new Exemplos20181109();
        janela.setSize(500, 300);
        janela.setVisible(true);
    }
    
}
