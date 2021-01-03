/*
public void paint(Graphics g)  --> Desenhar
*/

package thread;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;

public class barraFerramentas extends JFrame {
    JPanel barraDeFerramentas;
    JButton botaoNovo;
    JButton botaoAbrir;
    JButton botaoSalvar;
    JButton botaoAjuda;
    JButton botaoSair;
    JButton tela;
    
    public barraFerramentas(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        barraDeFerramentas = new JPanel (new FlowLayout(FlowLayout.LEFT));
        add(barraDeFerramentas, BorderLayout.NORTH);
        botaoNovo = new JButton (new ImageIcon("novo.jpg")); // basta passar nome do arquivo
        botaoNovo.setPreferredSize (new Dimension(50, 50));   // setar tamanho da imagem
        barraDeFerramentas.add(botaoNovo);
        botaoAbrir = new JButton (new ImageIcon("novo.jpg"));
        barraDeFerramentas.add(botaoAbrir);
        botaoSalvar = new JButton (new ImageIcon("novo.jpg"));
        barraDeFerramentas.add(botaoSalvar);
        botaoAjuda = new JButton (new ImageIcon("novo.jpg"));
        barraDeFerramentas.add(botaoAjuda);
        botaoSair = new JButton (new ImageIcon("novo.jpg"));
        barraDeFerramentas.add(botaoSair);
        tela = new JButton("Resto da tela");
        add(tela, BorderLayout.CENTER);
        
    }
    
    public static void main(String[] args) {
        barraFerramentas janela = new barraFerramentas();
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
}