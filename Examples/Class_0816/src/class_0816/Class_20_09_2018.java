/*Random */
package class_0816;

import java.util.Random;

public class Class_20_09_2018 {
    public static void main(String[] args) {
        Random r = new Random(100); // Entre parenteses, semente
//        for (int i = 0; i< 10; i++){
//            int n = r.nextInt(100);
////            double n = r.nextDouble();
//            System.out.println(n);
 //       }
        char c = (char) (r.nextInt(26) +61 ); // gerar letra aleatória
        System.out.println(c);
    }
}
