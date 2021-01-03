package class11_09;

import javax.swing.*;
import java.awt.*;

public class Class11_09 extends JFrame{
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
    
    public Class11_09(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 6));
        rotuloSeg = new JLabel("Seg");
        rotuloSeg = new JLabel("Ter");
        rotuloSeg = new JLabel("Qua");
        rotuloSeg = new JLabel("Qui");
        rotuloSeg = new JLabel("Sex");
        rotulo08 = new JLabel("08:00-10:00");
        rotulo10 = new JLabel("10:00-12:00");
        rotulo14 = new JLabel("14:00-16:00");
        rotulo16 = new JLabel("16:00-18:00");
        campos = new JTextField[4][5];
        add(new JPanel());
        add(rotuloSeg);
        add(rotuloTer);
        add(rotuloQua);
        add(rotuloQui);
        add(rotuloSex);
        
        add(rotulo08);
        for (int i=0; i<4; i+=1){
                campos[0][i] = new JTextField();
        }
        
        add(rotulo10);
        for (int i=0; i<4; i+=1){
                campos[1][i] = new JTextField();
        }
        
        add(rotulo14);
        for (int i=0; i<4; i+=1){
                campos[2][i] = new JTextField();
        }
        
        add(rotulo16);
        for (int i=0; i<4; i+=1){
                campos[3][i] = new JTextField();
        }
    }

    public static void main(String[] args) {
        Class11_09 janela = new Class11_09();
        janela.setSize(400, 300);
        janela.setVisible(true);
                
    }
    
}
