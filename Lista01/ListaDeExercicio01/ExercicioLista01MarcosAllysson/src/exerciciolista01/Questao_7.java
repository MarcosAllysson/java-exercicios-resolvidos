/*Escreva um programa que receba a idade de uma pessoa em anos e classifique
esta pessoa de acordo com a seguinte regra:
Idade Classificação:
0 a 2 anos Bebê;
3 a 11 anos Criança;
12 a 17 anos Adolescente;
18 a 24 anos Jovem;
25 a 59 anos Adulto;
60 a 99 anos Idoso;
100 anos ou mais Ancião*/
package exerciciolista01;

import javax.swing.JOptionPane;

public class Questao_7 {
    public static void main(String[] args) {
        int idade;
        String age;
        
        age = JOptionPane.showInputDialog("Qual sua idade? ");
        idade = Integer.parseInt(age);
        
        if ((idade >= 0) && (idade <= 2)){
            System.out.println("Bebê");
        } else if ((idade >= 3) && (idade <=11)){
            System.out.println("Criança");
        } else if ((idade >=12) && (idade <=17)) {
            System.out.println("Adolescente");
        } else if ((idade >=18) && (idade <= 24)){
            System.out.println("Jovem");
        } else if ((idade >= 25) && (idade <= 59)){
            System.out.println("Adulto");
        } else if ((idade >= 60) && (idade <= 99)){
            System.out.println("Idoso");
        } else if ((idade >= 100)){
            System.out.println("Ancião");
        }
    }
}
