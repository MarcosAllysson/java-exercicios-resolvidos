package ifb.tecinfo.lpoo.demonstracao;

import javax.swing.*;

public class EstruturaDoCodigoFonte {
    static int valor;

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        valor = aux.procedimento(5);
        if(valor >= 0) {
            do {
                JOptionPane.showMessageDialog(null, "O resultado é "+valor);
            } while(valor < 0);
        }
    }
}

class Auxiliar {
    int procedimento(int valor) {
        return 13;
    }
}