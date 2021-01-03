/*Questão 6: [4.0 pontos] Escreva um programa que apresente os 50 primeiros números da série de Fibonacci.
A série de Fibonacci é uma série em que o valor de um elemento é dado pela soma dos dois
elementos logo anteriores. Os dois primeiros termos da série de Fibonacci são iguais a 1.
1 1 2 3 5 8 13 . . .
 */
package lista_04;

public class Questao_06 {
    public static void main(String[] args) {
        int elemento1 = 1;
        int elemento2 = 0;
        int fibo;
        int i;
        
        for (i = 0; i<= 50; i++){
            System.out.println(elemento1);
            fibo = elemento1; // Variável fibo guarda o valor atual do elemento 1;
            elemento1 += elemento2; // Soma elemento 1 + 2;
            elemento2 = fibo; // Elemento 2 recebe valor atual antes da soma.
        }
    }
}
