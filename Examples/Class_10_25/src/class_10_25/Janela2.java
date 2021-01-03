package trabalho02;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;


public class Janela2 extends JFrame {
    JLabel rotuloA;
    JTextField campoA;
    JLabel rotuloB;
    JTextField campoB;
    JButton botao;
    JLabel rotuloResp;
    JTextField campoResp;
    
    public Janela2(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        rotuloA = new JLabel("a: ");
        add(rotuloA);
        
        campoA = new JTextField(10);
        add(campoA);
        
        rotuloB = new JLabel ("b: ");
        add(rotuloB);
        
        campoB = new JTextField(10);
        
        botao = new JButton("Somar ");
        
        rotuloResp = new JLabel("a+b: ");
        add(rotuloB);
        
        campoResp = new JTextField(10);
        add(campoB);
        add(botao);
        add(rotuloResp);
        add(campoResp);
        
        botao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(campoA.getText());
                int b = Integer.parseInt(campoB.getText());
                int c = a + b;
                campoResp.setText(""+c);
            }
        });
    }
    
    public static void main(String[] args) {
        Janela2 janela = new Janela2();
        janela.setSize(400, 300);
        janela.setVisible(true);
    }

}
