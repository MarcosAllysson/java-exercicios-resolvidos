public class UsoDoFinally {

    public static void main(String[] args) {
        int a = 10;
        for (int b = 0; b < 10; b++) {
            try {
                int c = a/(5-b);
		System.out.println("Resultado da divisao: "+ c+".");
            } catch (ArithmeticException ae) {
                System.out.println("Ocorreu exceção.");
            } finally {
                System.out.println("O Finally executa independente de haver ou não exceção.");
            }
        }
    }
    
}
