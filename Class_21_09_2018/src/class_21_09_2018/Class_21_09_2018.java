/*programa recebe duas palavras e coloca em ordem alfabética */
package class_21_09_2018;

import javax.swing.JOptionPane;

public class Class_21_09_2018 {

    public static void main(String[] args) {
//        String p1 = JOptionPane.showInputDialog("Primeira palavra: ");
//        String p2 = JOptionPane.showInputDialog("Segunda palavra: ");
//        
//        char a1 = p1.charAt(0);
//        char a2 = p2.charAt(0);
//        
//        if (a1 < a2) {
//            System.out.println("Primeiro: " +p1+ "  \n segundo: " +p2);
//        }
//        else {
//            System.out.println("Primeiro: " +p2+ "  \n segundo: " +p1);
//        }

        // Way 2:
//          String p1 = JOptionPane.showInputDialog("Primeira palavra: ");
//          String p2 = JOptionPane.showInputDialog("Segunda palavra: ");
//          if (p1.compareTo(p2) < 0){
//              System.out.println(p1 +" "+ p2);
//          } else if (p1.compareTo(p2) == 0){
//              System.out.println("Strings iguais: " +p2);
//          } else if (p1.compareTo(p2) > 0){
//              System.out.println( p2+ " " +p1);
//          }
          
          // compareToIgnoreCase -> ignora letra maiusculas e minuscula:
          String p1 = JOptionPane.showInputDialog("Primeira palavra: ");
          String p2 = JOptionPane.showInputDialog("Segunda palavra: ");
          if (p1.compareToIgnoreCase(p2) < 0){
              System.out.println(p1 +" "+ p2);
          } else if (p1.compareToIgnoreCase(p2) == 0){
              System.out.println("Strings iguais: " +p2);
          } else if (p1.compareToIgnoreCase(p2) > 0){
              System.out.println( p2+ " " +p1);
          }
    } 
}
