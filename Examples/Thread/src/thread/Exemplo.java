package Thread;

public class Exemplo {
    public static void main(String[] args) {
        ExemploThread eta = new ExemploThread();
        eta.nome = "A";
        ExemploThread etb = new ExemploThread();
        etb.nome = "B";
        etb.start();
        eta.start();
        try{
            eta.join();
        } catch (InterruptedException ex){
        }
        
        for (int i=0; i<10000; i++){
            System.out.println("M: " +i);
        }
    }
}

class ExemploThread extends Thread {
    String nome;
    public void run(){
        for (int i=0; i<10000; i++){
            System.out.println(nome+ ": " +i);
        }
    }
}