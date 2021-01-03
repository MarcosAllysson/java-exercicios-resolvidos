package thread;

public class ExemploBanc {
    public static void main(String[] args) {
        contaCorrente contaDoFulano = new contaCorrente();
        contaDoFulano.saldo = 1500;
        TerminalAutoAtendimento t1 = new TerminalAutoAtendimento();
        t1.cc = contaDoFulano;
        TerminalAutoAtendimento t2 = new TerminalAutoAtendimento();
        t2.cc = contaDoFulano;
        TerminalAutoAtendimento t3 = new TerminalAutoAtendimento();
        t3.cc = contaDoFulano;
        t1.start();
        t2.start();
        t3.start();
        
    }
}

class TerminalAutoAtendimento extends Thread {
    contaCorrente cc;
    public void run(){
        cc.realizaSaque(1000);
    }
}

class contaCorrente {
    float saldo;
    //public void realizaSaque(float valor){
    public synchronized void realizaSaque(float valor){
        if (valor <= saldo){
            System.out.println("processamento...");
            try{
                Thread.sleep(10);
                
            } catch (InterruptedException ex) {
                
            }
            saldo -= valor;
            System.out.println("Saque realizado \n Saldo: " +saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
