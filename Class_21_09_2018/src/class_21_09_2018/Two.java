/*programa que recebe palavra ou frase e mostre quantas vogais (a,e,i,o,u)existem na palavra */

package class_21_09_2018;

import javax.swing.JOptionPane;

public class Two {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Insira string: ");
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++){
            char caractere = palavra.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' || caractere == 'á' || caractere == 'à' || caractere == 'ã' || caractere == 'â' || caractere == 'é' || caractere == 'ê' || caractere == 'ó' || caractere == 'õ' || caractere == 'í' || caractere == 'ú'){
                cont ++;
            } 
        } System.out.println("Vogais: " +cont);
    }
}
