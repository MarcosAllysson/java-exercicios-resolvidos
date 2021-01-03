package  Class_21_09_2018;

import java.text.DecimalFormat;
import java.util.Random;

public class SenhaAleatoria {
    public static void main(String[] args) {
        Random r = new Random();
//        int n = r.nextInt(1000000);
//        System.out.println(n);

        int n = r.nextInt(1000000);
        DecimalFormat df = new DecimalFormat("000000");
        String senha = df.format(n);
        System.out.println(senha);


//        int n = r.nextInt(900000)+100000;
//        System.out.println(n);

//        for(int i = 0; i < 6; i++) {
//            int n = r.nextInt(10);
//            System.out.print(n);
//        }
//        System.out.println("");
    }
}













