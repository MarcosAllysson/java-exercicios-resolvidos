package thread;
import javax.swing.*;
import java.awt.*;

public class ExemploDesenhado extends JFrame{
    BotaoDesenhado botao;
    
    public ExemploDesenhado(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        botao = new BotaoDesenhado();
        add(botao);
    }
    
    public static void main(String[] args) {
        ExemploDesenhado janela = new ExemploDesenhado();
        janela.setSize(500, 500);
        janela.setVisible(true);
    }
}

class BotaoDesenhado extends JButton{
    public void paint(Graphics g){
        super.paint(g);// fundo degradê
        g.setColor(Color.green);
        g.drawLine(5, 5, 450, 450);
        g.setColor(Color.blue);
        g.drawArc(250, 10, 250, 250, 0, 360);
        g.setColor(Color.orange);
        g.fillArc(10, 250, 250, 250, 0, 270);
        // não se usa objeto do graphics, ele já existe. Gerado quando componente é criado.
        // não preciso chamar método, é herdado quando botao é chamado
    }
}
