package class_10_25;

import javax.swing.JOptionPane;

public class Agenda {
    public static void main(String[] args) {
        Contato[] agenda = new Contato[5];
        agenda[0] = new Contato("Angélica", "111-1111", "Águas claras");
        agenda[1] = new Contato("Bia", "222-22222", "Braz");
        agenda[2] = new Contato("Kah", "333-3333", "Cei");
        agenda[3] = new Contato("Dani", "444-4444", "Fernandopólis");
        agenda[4] = new Contato("Érica", "555-5555", "Estru");
        
        String nome = JOptionPane.showInputDialog("Qual nome procuras? ");
        
        Agenda ag = new Agenda();
        Contato contato = ag.busca(agenda, nome);
        if (contato != null){
            JOptionPane.showMessageDialog(null, "Contato: \n nome: " +contato.nome + "\n telefone: " +contato.telefone +"\n endereço: " +contato.endereco);
        } else {
            JOptionPane.showMessageDialog(null, "Contato não achado! ");
        }
    }
    
    Contato busca(Contato[]agenda, String nome){
        for (int i=0; i<agenda.length; i++){
            if (agenda[i].nome.equalsIgnoreCase(nome)){
                return agenda[i];
            }
        }
        return null;
    }
}

class Contato{
    String nome;
    String telefone;
    String endereco;
    
    public Contato(String nome, String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
