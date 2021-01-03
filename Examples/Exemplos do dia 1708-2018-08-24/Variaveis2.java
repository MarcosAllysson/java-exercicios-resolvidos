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
public class Variaveis2 {
    public static void main(String[] args) {
        byte b = 3;
        byte c = 6;
//        byte d = b+c; // A soma converte os valores para int.
        byte d = (byte) (b+c); // Cast ou coerção. Força a variável para o tipo entre parenteses.
        System.out.println("valor de d: "+d);
    }
}















