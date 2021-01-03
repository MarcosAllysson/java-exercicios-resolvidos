package class_0824;

public class Class_Exemplo02 {
    int saldo;
    
    void realizaSaque (int valor) {
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("saldo realizado com sucesso");
        } else {
            System.out.println("Saque não foi realizado. \n ");
        }
    }
    void mostraMesagemDeSeguranca(){
        System.out.println("não mostre sua senha para ninguém");
    }
    
    public static void main(String[] args) {
        Class_Exemplo02 classe2 = new Class_Exemplo02();
        classe2.realizaSaque(1);
    }
}
