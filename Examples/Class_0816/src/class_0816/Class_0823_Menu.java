package class_0816;

import javax.swing.JOptionPane;

public class Class_0823_Menu {
    public static void main(String[] args) {
        String [] opcoes = {"Sim","Não","Cancelar","Sair"};
        int opcao = JOptionPane.showOptionDialog(null,"Qual opção você deseja?","Menu Simples", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if(opcao == JOptionPane.YES_OPTION){
            System.out.println("Você digitou SIM");
        } else if (opcao == JOptionPane.NO_OPTION){
            System.out.println("Você digitou NÃO");
        } else if (opcao == JOptionPane.CANCEL_OPTION){
            System.out.println("Você digitou CANCELAR");
        } else if (opcao == JOptionPane.CANCEL_OPTION+1){
            System.out.println("Você digitou SAIR");
        }
    }
}
