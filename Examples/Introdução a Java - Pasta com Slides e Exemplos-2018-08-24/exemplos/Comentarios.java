/*
 * Comentarios.java
 *
 * Criado no dia 22 de Setembro de 2006, 10:08
 *
 * Este arquivo serve para apresentar exemplos de comentários em Java
 * 
 */

/**
 * Pode haver comentário sobre a classe
 * @author Alex
 */
public class Comentarios {
    // Podem ser colocados comentários para os atributos.
    int v1;
    int v2;
    String a3;
    
    /** Método que é chamado quando executo o programa.
     * Cria um objeto da classe e executa um método dele.
     * @param args não é utilizado
     */
    public static void main(String[] args) {
        Comentarios comentarios = new Comentarios(); // Instanciando um objeto de Comentarios
        comentarios.codigoInutil(5); // Chamada do método codigoInutil
    }
    
    /**
     * Pode-se utilizar comentário para explicar determinados métodos e seus
     * argumentos.
     * @param valor
     */
    public void codigoInutil (int valor) {
        valor = valor + 4;
        valor -= 56;
        valor = valor%(valor -1); // Comentários podem ser feitos com duas barras inclinadas.
//        int variavel = (((valor+valor)*valor)-valor)/valor;
        System.out.println(valor);
    }
    
}
