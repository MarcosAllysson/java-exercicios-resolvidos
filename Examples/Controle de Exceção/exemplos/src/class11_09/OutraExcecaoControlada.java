public class OutraExcecaoControlada {
    
    public static void main(String[] args) {
        String a = "5";
        String b = "0.4";
        try {
            
            int c = Integer.parseInt(a)/Integer.parseInt(b);
            System.out.println("Resultado da divisao: "+ c+".");
        } catch(ArithmeticException ae) {
            System.out.println("O denominador n�o pode ser zero.");
        } catch(NumberFormatException nfe) {
            System.out.println("Os Strings devem ser compostos apenas por algarismos");
        }
        System.out.println("Se a exce��o for capturada, ela n�o interrompe o programa, como no exemplo anterior.");
    }
    
}
