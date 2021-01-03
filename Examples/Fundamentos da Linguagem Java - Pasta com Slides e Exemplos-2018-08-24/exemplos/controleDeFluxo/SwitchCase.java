
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoda
 */
public class SwitchCase {

    public static void main(String[] args) {
        int opcao;
        String opcaoTexto = JOptionPane.showInputDialog("Escolha uma opção:\n1. Novo jogo\n2. Carregar jogo salvo\n3. Salvar jogo\n4. Sair\n");
        opcao = Integer.parseInt(opcaoTexto);

        switch(opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Novo jogo.\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Carregar jogo.\n");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Salvar jogo.\n");
            case 4:
                JOptionPane.showMessageDialog(null, "Sair.\n");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.\n");
                break;
        }
    }
}
