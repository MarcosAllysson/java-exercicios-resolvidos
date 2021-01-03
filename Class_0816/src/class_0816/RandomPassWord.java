/*gerar senha aleatoria  composta por 6 digitos  */
package class_0816;

import java.text.DecimalFormat;

import java.util.Random;

public class RandomPassWord {
    public static void main(String[] args) {
        Random pass = new Random();
        
//            int r = pass.nextInt(900000)+100000; // não geraria senha começando 0
//            System.out.println(r);
//            
//            for (int i=0; i<6; i++){
//              int n = pass.nextInt(10);
//                System.out.print(n);
//            }
//            System.out.println("");
//            
            int n = pass.nextInt(1000000);
            DecimalFormat df = new DecimalFormat("000000");
            String senha = df.format(n);
            System.out.println(senha);
    }
}
