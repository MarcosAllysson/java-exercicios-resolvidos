public class DivisaoPorZeroControlada {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a/b;
            System.out.println("Resultado da divisao: "+ c+".");
        } catch(ArithmeticException ae) {
            System.out.println("O denominador não pode ser zero.");
        }
        System.out.println("Se a exceção for capturada, ela não interrompe o programa, como no exemplo anterior.");
    }
    
}
