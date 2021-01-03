package thread;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PingPong {
    public static void main(String[] args) {
        Ping ping = new Ping();
        Pong pong = new Pong();
        ping.pong = pong;
        ping.start();
        pong.start();
    }
}

class Ping extends Thread {
    Pong pong;
    public void run(){
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep((r.nextInt(10) +1)*1000);
            } catch (InterruptedException ex) {
            }
            System.out.println("Ping...");
            synchronized(pong){
                pong.notify();
            }
        }
    }
}

class Pong extends Thread{
    public void run(){
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            try {
                synchronized(this){
                    wait();
                    Thread.sleep((r.nextInt(10) +1)*1000);
                }
            } catch (InterruptedException ex) {
            }
            System.out.println("Pong!!");
        }
    }
}