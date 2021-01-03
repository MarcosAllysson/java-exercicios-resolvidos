package exerciciolista01;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        String[] opcoes = {"YES","NO","CANCEL"};
        int opcao = JOptionPane.showOptionDialog(null,"Bad Ass Menu - Pick an Option:", "Top Menu", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, opcoes, opcoes[0]);
        if (opcao == JOptionPane.YES_OPTION){
            System.out.println("You typed YES!");
        } else if (opcao == JOptionPane.NO_OPTION){
            System.out.println("You selected NO!");
        } else if (opcao == JOptionPane.CANCEL_OPTION){
            System.out.println("The cancel option was chosen");
        }
    } 
}
