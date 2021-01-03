/*Questão 3: [1.5 ponto] Escreva um programa que receba uma temperatura em graus Celsius e a converta
para graus Fahrenheit. A fórmula de conversão está apresentada abaixo:
F = 9 x C / 5 + 32
 */
package lista_02_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao_03 {
    public static void main(String[] args) {
        int temp;
        int fah;        
        String temperatura;
         
        temperatura = JOptionPane.showInputDialog("Digite a temperatura: ");
        temp = Integer.parseInt(temperatura);
        
        fah = 9 * temp / 5 + 32;
        JOptionPane.showMessageDialog(null,"De Celsius para Fahrenheit é: " +fah);
    }
}
