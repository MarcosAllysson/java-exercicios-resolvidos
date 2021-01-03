/*Escreva um método que receba um número inteiro e
retorne o dobro deste número. Escreva um programa, cujo método
main() chame o método criado para dobrar o valor do número
passado. */
package class_0824;

public class ExercicioSlide2 {
    public static int numeroDobro(int a){
        a = a*2;
        return a;
    } 
    public static void main(String[] args) {
        ExercicioSlide2 dobro = new ExercicioSlide2();
        int x = dobro.numeroDobro(5);
        System.out.println(""+x);
    }
}
