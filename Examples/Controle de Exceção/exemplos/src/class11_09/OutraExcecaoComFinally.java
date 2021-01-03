public class OutraExcecaoComFinally {
    
    public static void main(String[] args) {
        String a = "5";
        String b = "0.4";
        try {
            int c = Integer.parseInt(a)/Integer.parseInt(b);
            System.out.println("Resultado da divisao: "+ c+".");
        } catch(ArithmeticException ae) {
            System.out.println("O denominador não pode ser zero.");
        } finally {
            System.out.println("O finally executa independente de a exceção ser de um tipo que foi capturada ou não.");
        }
        System.out.println("Se a exceção não for capturada, mesmo tendo executado o finally, ela interrompe o programa.");
    }
    
}
