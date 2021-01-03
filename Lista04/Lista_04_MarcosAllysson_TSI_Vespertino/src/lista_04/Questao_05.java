/*Questão 5: [3.0 pontos] Escreva um programa que receba do usuário as notas das três atividades de
um aluno (lista de exercícios, apresentação do seminário e prova final) e calcule a média final da
disciplina, que será efetivada por média ponderada com pesos das notas: 2, 3 e 5 respectivamente.
Então o programa deve apresentar na tela a média final do aluno e a situação dele na disciplina,
que será “Aprovado” caso o aluno obtenha média maior ou igual a 6, ou “Em construção” caso
contrário.
 */
package lista_04;

import javax.swing.JOptionPane;

public class Questao_05 {
    public static void main(String[] args) {
        String nota1 = JOptionPane.showInputDialog("Nota da lista de exercícios? ");
        float listaExercicios = Float.parseFloat(nota1);
        
        String nota2 = JOptionPane.showInputDialog("Nota da apresentação do seminário? ");
        float apresentacaoSeminario = Float.parseFloat(nota2);
        
        String nota3 = JOptionPane.showInputDialog("Nota da prova final? ");
        float provaFinal = Float.parseFloat(nota3);
        
        float mediaNotas = (listaExercicios * 2 + apresentacaoSeminario * 3 + provaFinal * 5) / 10;
                
        if (mediaNotas >= 6){
            JOptionPane.showMessageDialog(null,"Média das notas: " +mediaNotas+ " \n Situação: Aprovado!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Média das notas: " +mediaNotas+ " \n Situação: Em Construção!");
        }
    }
}
