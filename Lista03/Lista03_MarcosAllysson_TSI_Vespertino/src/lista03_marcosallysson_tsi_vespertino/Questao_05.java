/*Questão 5: [1.5 ponto] Escreva um programa que apresente na tela uma tabela contendo valores de
graus Celsius e o seu valor em graus Fahrenheit. Utilize os valores de graus Celsius começando em
zero (`0') e aumentando de 30 em 30 até chegar em 300 (0; 30; 60; 90; . . . ; 300).  */
package lista03_marcosallysson_tsi_vespertino;

public class Questao_05 {
    public static void main(String[] args) {
        int cel;
        int fah;
        
        System.out.println("Celcius | Fahrenheit \n");
        for (int i=0; i<=300; i+=30){
            fah = 9 * i / 5 + 32;
            System.out.println("Celcius: " +i+ " Fahrenheit: "+fah);   
        }
    }
}
