package class_10_25;

public class Troca {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        
        // Perde o valor original de X.
//        x = y;
//        y = x;
//        System.out.println("x: "+x);
//        System.out.println("y: "+y);
        
        int swap = x;
        x = y;
        y = swap;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
