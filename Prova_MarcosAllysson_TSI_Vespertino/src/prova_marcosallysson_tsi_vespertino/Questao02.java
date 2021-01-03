/*Questão 2: [3.5 pontos] A sequência de Pell é uma sequência de números naturais onde cada termo da
sequência pode ser encontrada adicionando duas vezes seu precedente ao termo anterior. Os dois
primeiros termos da sequência são 0, 1. Os outros termos todos podem ser calculados pela fórmula
Pn = 2 * Pn−1 + Pn−2. Escreva um programa que calcule e apresente os 50 primeiros números da
sequencia de Pell.
0, 1, 2, 5, 12, 29, 70, 169, 408, 985, . . .

 */
package prova_marcosallysson_tsi_vespertino;

public class Questao02 {
    public static void main(String[] args) {
        int [] p = new int [50] ;
        p[0] = 0;
        p[1] = 1;
        for (int i = 2; i < p.length; i++){
            p[i] = 2 * p[i-1] + p[i-2];
            System.out.println(p[i]);
            
        }
    }
}
