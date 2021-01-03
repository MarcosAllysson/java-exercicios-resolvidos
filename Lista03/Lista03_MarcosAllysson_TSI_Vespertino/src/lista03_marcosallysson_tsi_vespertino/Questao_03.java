/*Questão 3: [1.5 ponto] Escreva um programa que apresente um menu para o usuário selecionar uma
das quatro operações fundamentais (soma, subtração, multiplicação ou divisão) e após o usuário
selecionar a operação, permita ao usuário inserir dois números e apresente o resultado da operação
selecionada com estes números. */
package lista03_marcosallysson_tsi_vespertino;

import javax.swing.JOptionPane;

public class Questao_03 {
    public static void main(String[] args) {
       String []opcoes = {"Soma","Subtração","Multiplicação","Divisão"};
       int opcao = JOptionPane.showOptionDialog(null,"Escolha uma opçao: ","Calculadora", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
       
       if (opcao == JOptionPane.YES_OPTION){
           double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Faça sua soma: \n\n Qual primeiro número?"));
           double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual segundo número? "));
           double resultado = a+b; 
           JOptionPane.showMessageDialog(null,"A soma de "+a+ " + " +b+ " é: " +resultado);
       } 
       else if (opcao == JOptionPane.NO_OPTION){
           double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Faça sua subtração: \n\n Qual primeiro número?"));
           double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual segundo número?"));
           double resultado = a-b;
           JOptionPane.showMessageDialog(null,"A subtração de " +a+ " - " +b+ " é: " +resultado);
       }
       else if (opcao == JOptionPane.CANCEL_OPTION){
           double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Faça sua multiplicação: \n\n Qual primeiro número?"));
           double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual segundo número? "));
           double resultado = a*b;
           JOptionPane.showMessageDialog(null,"A multiplicaçã de " +a+ " x " +b+ " é: " +resultado);
       }
       else if (opcao == JOptionPane.CANCEL_OPTION+1){
           double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Faça sua divisão: \n\n Qual primeiro número?"));
           double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual segundo número?"));
           double divi = n1/n2;
           JOptionPane.showMessageDialog(null,"A divisão de " +n1+ " / " +n2+ " é: " +divi);
       }
    }
}
