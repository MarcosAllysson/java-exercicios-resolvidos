/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_0816;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Class_0823 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Você quer começar aogra?");
        int i = Integer.parseInt(texto);
        for (; i<= 10; i+=1){
            System.out.println(i);
        } 
    }
}
