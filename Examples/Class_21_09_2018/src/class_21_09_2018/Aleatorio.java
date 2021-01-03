package class_21_09_2018;

import java.util.Random;

public class Aleatorio {

    public static void main(String[] args) {
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
//            int n = r.nextInt(6) + 5;
            double n = r.nextDouble()*250;
            System.out.println(n);
        }
        
//        char c = (char) (r.nextInt(26)+65);
//        System.out.println(c);
        
    }
    
}
