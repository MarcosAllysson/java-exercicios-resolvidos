/*
DISPOSE_ON_CLOSE -> FECHA JANELA ATUAL APENAS.
DO_NOTHING_ON_CLOSE -> FAZ NADA QUANDO CLICA NO BOTÃO
EXIT_ON_CLOSE FECHA -> TODAS AS JANELAS
*/

package trabalho02;

import java.awt.FlowLayout;
import javax.swing.*;

public class PrimeiraJanela extends JFrame{
    JLabel rotulo;
    JTextField campo;
    JButton botao;
    JTextArea area;
    
    public PrimeiraJanela(){
           setLayout (new FlowLayout()); 
           setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
           rotulo = new JLabel("Escreva algo: \n\nEscrevi! ");
           add(rotulo);
           
           campo = new JTextField(10);
           add(campo);
           
           area = new JTextArea(5, 10);
           add(area);
           
           botao = new JButton("Process ");
           add(botao);
    }
    
    
    public static void main(String[] args) {
           PrimeiraJanela janela = new PrimeiraJanela();
           
           janela.setSize(500,500);
           janela.setVisible(true);
    }
}
