/*Questão 2: [1.0 ponto] Qual saída deve ser apresentada quando for executado o seguinte programa?
Justifique.
class Principal {
public static void main(String[] args) {
    int i = 0;
    int j = 20;
    for(i = 0; i < j; i++) {
        j--;
    }
        System.out.println("i: "+i+"; j: "+j);
    }
}
a( ) i: 0; j: 20
b( ) i: 10; j: 10
c( ) i: 1; j: 19
d( ) i: 20; j: 0
e( ) O código não compila devido a repetição do sinal de soma e do sinal de subtração.
 */
package lista_04;

public class Questao_02 {
    public static void main(String[] args) {
        int i = 0;
        int j = 20;
        for(i = 0; i < j; i++) {
            j--;
        }
        System.out.println("i: "+i+"; j: "+j); 
        
        /* 
        JUSTIFICATIVA:
        
        Será apresentado a opção B, por que a condição inicial de I = 0, até que ele seja menor do que J,
        o que já começa sendo verdadeiro. Porém, ele será incrementado só até passar o valor menor que J, 
        que este dentro do laço, estará sendo diminuído em uma unidade. Enquanto que I está aumentando em 
        uma unidade, até que a condição de que, I < J, seja alcançada.        
        */
    }
}
    

