package Class_21_09_2018;

import java.text.DecimalFormat;

public class FormatoNumerico {
    public static void main(String[] args) {
        double f = 10.0/3;
        DecimalFormat df = new DecimalFormat("R$ #0.00");
        String preco = df.format(f);
        System.out.println("preço: "+preco);
    }
}
