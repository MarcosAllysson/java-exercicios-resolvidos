public class OutraExcecaoControladaGenerica {
    
    public static void main(String[] args) {
        String a = "5";
        String b = "0.4";
        try {
            
            int c = Integer.parseInt(a)/Integer.parseInt(b);
            System.out.println("Resultado da divisao: "+ c+".");
        } catch(Exception e) {
            System.out.println("Este catch poderia (deveria) ser feito com NumberFormatException e ArithmeticException.");
            System.out.println("Pode ser feito o uso de Exception porque pode-se capturar uma exceção por uma superclasse dela (de qualquer hierarquia), e todas as exceptions herdam de exception (direta ou indiretamente).");
        }
        System.out.println("Se a exceção for capturada, ela não interrompe o programa, como no exemplo anterior.");
    }
    
}
