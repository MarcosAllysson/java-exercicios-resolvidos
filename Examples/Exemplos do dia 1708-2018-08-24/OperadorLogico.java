/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos20180817;

/**
 *
 * @author yoda
 */
public class OperadorLogico {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        if((b==0)||(a/b > 3)) { // Não lança excessão porque b == 0 já determinou o resultado da operação lógica.
//        if((a/b > 3)||(b==0)) { // Lança excessão por causa da divisão por zero.
            System.out.println("A razão foi maior que três.");
        }
        System.out.println("Resto do programa.");
    }
}

















