public class OutraExcecao {
    
    public static void main(String[] args) {
        String a = "5";
        String b = "0.4";
        try {
            
            int c = Integer.parseInt(a)/Integer.parseInt(b);
            System.out.println("Resultado da divisao: "+ c+".");
        } catch(ArithmeticException ae) {
            System.out.println("O denominador não pode ser zero.");
        }
        System.out.println("Se a exceção não for capturada, ela interrompe o programa.");
    }
    
}
