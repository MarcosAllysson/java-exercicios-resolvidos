
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoda
 */
public class ESimplificado {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

//        if((a/b > 1)) { // Esta condição pode causar erro na execução, caso o divisor seja 0.

//        if((b != 0) & (a/b > 1)) { // Continua dando erro, pois um & apenas significa a execução de ambos os termos e depois comparação bit-a-bit dos termos.

        if((b != 0) && (a/b > 1)) { // O primeiro termo sendo falso, necessariamente, a função E terá resultado falso, então não testa o segundo termos, evitando assim o erro.
            System.out.println("Foi obtida uma razão maior que 1.\n");
        } else {
            System.out.println("Não foi obtida uma razão maior que 1.\n");
        }
    }
    
}
