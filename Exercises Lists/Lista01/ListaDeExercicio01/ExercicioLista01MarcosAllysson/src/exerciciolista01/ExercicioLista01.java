/* Questão 2 */
package exerciciolista01;

public class ExercicioLista01 {

    public static void main(String[] args) {
        // QUESTÃO 2.
        int x = 2;
        int y = 4;
         if (x < 3){
             if(y > 5){
                 System.out.println("Escreve um");
             } else {
                 System.out.println("Escreve dois");
             }
         } else {
             if (y < 5){
                 System.out.println("Escreve três");
             } else {
                 System.out.println("Escreve quatro");
             }
         }
    }
}
/* O programa escreve dois porque a primeira condição (x < 3) é verdadeira. Com isso,
o bloco de execução será analizado. Como a segunda condição (y > 5) é falsa, ele
printa na tela o else, ou seja, ("Escreve dois"). */