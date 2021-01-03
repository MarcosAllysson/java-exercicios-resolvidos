/*Questão 2: [1.0 ponto] Quais saídas devem ser apresentadas quando for executado o seguinte programa?
fiJustique.
public class Programa {
public static void main(String[] args) {
int x = 10;
switch(x) {
case 0: System.out.println("nulo.");
case 10: System.out.println("dezena.");
case 100: System.out.println("centena.");
case 1000: System.out.println("milhar.");
default: System.out.println("outro.");
}
}
}
a( ) nulo.
b( ) dezena.
c( ) centena.
d( ) milhar.
e( ) outro.
 */
package lista03_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao_02 {
    public static void main(String[] args) {
    int x = 10;
        switch(x) {
        case 0: System.out.println("nulo.");
        case 10: System.out.println("dezena.");
        case 100: System.out.println("centena.");
        case 1000: System.out.println("milhar.");
        default: System.out.println("outro.");
        } JOptionPane.showMessageDialog(null,"Questão Resposta 02: \n\nSerá impressa na tela as alternativas B, C, D e E, porque não houve nenhum "
                + "comando break, após cada case. Como não teve nenhum indicativo da parada do programa, ele executa todas as "
                + " alternativas possíveis. \n A resposta não pode ser A, porque o valor atribuído à "
                + "variável, não ficou vazio.");
    } 
}
