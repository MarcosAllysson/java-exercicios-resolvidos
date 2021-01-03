/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11_09;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ControleDeExcecao {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null," Início do programa ");
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("digite numerador: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("digite denominador: "));
            int c = a/b;
            JOptionPane.showMessageDialog(null,"Resultado deu: " +c);
//        } catch (Exception e) { // inclui todos os erros. Ideal que não seja usado, melhor personalizar cada erro. Exceção por exceção
//            JOptionPane.showMessageDialog(null," Erro catastrófico. ");
        } catch (ArithmeticException ae) {
            JOptionPane.showMessageDialog(null," O denominador não pode ser 0. ");
            
//            System.out.println("Exception: " +ae.getMessage());
//        } catch (NumberFormatException nfe) {
//            //JOptionPane.showMessageDialog(null," os numeros devem ser apenas algarismos ");
//            nfe.printStackTrace();
//        }
        } finally {
            System.out.println("Realizou o finally " );
        }
        JOptionPane.showMessageDialog(null," O resto do programa continua... ");
    }
}
