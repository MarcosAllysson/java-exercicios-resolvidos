public class ExcecaoVerificadaNaoTratada {
    
    public static void main(String[] args) {
        byte[] texto = new byte[20];
        System.out.println("Escreva algo:");
        System.in.read(texto);
        System.out.println("Você escreveu:");
        System.out.write(texto);
    }
    
}
