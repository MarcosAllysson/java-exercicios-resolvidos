/*Questão 4: [1.5 ponto] Escreva um programa que receba do usuário as sete últimas cotações do dolar
e, em seguida, calcule a média da cotação do dólar na última semana. Utilize a média aritmética
(soma de todos os valores, dividida pela quantidade de valores). */
package lista_02_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao_04 {
    public static void main(String[] args) {
        float dolar[] = new float [7];
        float num=0;
        
        for (int i=0; i<dolar.length; i+=1){
            String money = JOptionPane.showInputDialog("Qual valor do dólar: ");
            dolar [i] = Float.parseFloat(money);
            num += dolar[i];
        }
        float media = num / dolar.length;
        JOptionPane.showMessageDialog(null,"Média da cotação do dólar na última semana foi: $"+media);       
    }
}
