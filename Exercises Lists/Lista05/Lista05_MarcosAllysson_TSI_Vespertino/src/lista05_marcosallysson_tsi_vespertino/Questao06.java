/*Questao 6: [4.0 pontos] Escreva um programa que calcule e liste todos os numeros primos de 1 a 1000. */
package lista05_marcosallysson_tsi_vespertino;

public class Questao06 {
    
    public static void main(String[] args) {
        int Final = 1000;
        
        System.out.println("Números primos: ");
        for (int i=2; i<=Final; i++){
            int cont = 2;
            boolean primo = true; // número já começa sendo verdadeiro antes das verificações
            while (primo && cont < i){ // contador tem que ser menor do que I
                if (i % cont == 0){ // qualquer número divisível por 2, sem contar ele mesmo, não é primo
                    primo = false; // com isso, "primo" passa a ser falso
                }
                else {
                    cont++; // se não, contador é incrementado
                }
            }
            if (primo){ // se continuar sendo primo, exibir
                System.out.print(i+" ,");
            }
        }
    }
}
