/*Quest˜ao 2: [1.0 ponto] Após a execução da linha de código a seguir, quais afirmativas são verdadeiras?
Justifique.
int[] x = new int[25];
a( ) O valor de x[24] ´e 0.
b( ) O valor de x[24] ´e indefinido.
c( ) O valor de x[25] ´e 0.
d( ) O valor de x[0] ´e null.
e( ) O valor de x[0] ´e 1.
f( ) O valor de x.length ´e 25.
 */
package lista05_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao02 {
    public static void main(String[] args) {
        int[] x = new int[25];
        
//        System.out.println(x.length);
//        System.out.println(x[25]);
//        System.out.println(x[24]);
//        System.out.println(x[0]);
        
        JOptionPane.showMessageDialog(null,"Resposta Questão 02: \n\n Opções verdadeiras: \n (A) por que nenhum valor foi atribuído ao índice x, na posição 24."
                + "\n (E) por que esse foi o comprimento do array atribuído à variável x. ");
    }
}
