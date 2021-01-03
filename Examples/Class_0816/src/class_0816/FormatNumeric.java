package class_0816;

import java.text.DecimalFormat;

public class FormatNumeric {
    public static void main(String[] args) {
        float f = 10f/3;
        DecimalFormat df = new DecimalFormat("#0.00");
        String preco = df.format(f);
        System.out.println("preço: " +preco);
        
        
    }
}
