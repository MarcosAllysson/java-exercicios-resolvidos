/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos20181116;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author yoda
 */
public class EscritaArquivoTexto {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite algo:");
        byte[] arrayDeBytes = texto.getBytes();
        File arquivo = new File("Filosofia.txt");
        try{
//            FileOutputStream fos = new FileOutputStream(arquivo); // Sobrescreve
            FileOutputStream fos = new FileOutputStream(arquivo, true);// Acrescenta no final
            fos.write(arrayDeBytes);
            fos.close();
        } catch(FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
        } catch(IOException ioe) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura do arquivo.");
        }
        
    }
}
