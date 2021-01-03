/*Escreva um programa que receba um numero do usuario
em hexadecimal e apresente o numero em binario. Sugest~ao: Use
classe Wrapper.  */
package class_2808_08_31;

import javax.swing.JOptionPane;

public class Class_2808_08_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String val = JOptionPane.showInputDialog("insira valor: ");
//        int bi = Integer.parseInt(val,16);
//        String bin = Integer.toBinaryString(bi);
//        System.out.println(""+ bin);     

        /*Escreva um programa que receba do usuario um
caractere e informe se este caractere e uma letra minuscula, uma letra
maiuscula, um espaco em branco, um digito numerico ou um
caractere especial (algo diferente das opc~oes anteriores).*/
        String carac = JOptionPane.showInputDialog("Insira caractere: ");
        char car = carac.charAt(0);
        
        if (Character.isLowerCase(car)){
            System.out.println("Minuscula: True");
        } else {
            System.out.println("Minuscula: False");
        }
        
        if (Character.isUpperCase(car)){
            System.out.println("Maiuscula: True");
        } else {
            System.out.println("Maiuscula: False");
        }
        
        if (Character.isWhitespace(car)){
            System.out.println("Espaço branco: TRUE");
        } else {
            System.out.println("Espaço branco: FALSE");
        }
        
        if (Character.isDigit(car)){
            System.out.println("Dgito: TRUE");
        } else {
            System.out.println("Digito: False");
        }
        
        if (Character.isValidCodePoint(car)){
            System.out.println("Caractere especial: true");
        } else {
            System.out.println("Caractere especial: false");
        }
    }
}
