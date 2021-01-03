/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoda
 */
public class Incremento {
    public static void main(String[] args) {
        int a = 8;
        int b;
        System.out.println("\'a\' iniciando em 8. Fazendo o incremento após a atribuição:");
        b = a++;
        System.out.println("a: "+a+"\tb: "+b+"\n\n");

        a = 8;
        System.out.println("\'a\' iniciando em 8. Fazendo o incremento antes da atribuição:\n");
        b = ++a;
        System.out.println("a: "+a+"\tb: "+b+"\n\n");
    }
    
}
