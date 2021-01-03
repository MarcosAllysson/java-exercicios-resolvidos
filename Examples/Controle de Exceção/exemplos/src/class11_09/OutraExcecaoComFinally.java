public class OutraExcecaoComFinally {
    
    public static void main(String[] args) {
        String a = "5";
        String b = "0.4";
        try {
            int c = Integer.parseInt(a)/Integer.parseInt(b);
            System.out.println("Resultado da divisao: "+ c+".");
        } catch(ArithmeticException ae) {
            System.out.println("O denominador n�o pode ser zero.");
        } finally {
            System.out.println("O finally executa independente de a exce��o ser de um tipo que foi capturada ou n�o.");
        }
        System.out.println("Se a exce��o n�o for capturada, mesmo tendo executado o finally, ela interrompe o programa.");
    }
    
}
