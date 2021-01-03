/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos20181116;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author yoda
 */
public class EscritaArquivoCSV {
    public static void main(String[] args) {
//        String texto = JOptionPane.showInputDialog("Digite algo:");
//        byte[] arrayDeBytes = texto.getBytes();
        File arquivo = new File("estoque.csv");
        try{
//            FileOutputStream fos = new FileOutputStream(arquivo); // Sobrescreve
            FileOutputStream fos = new FileOutputStream(arquivo, true);// Acrescenta no final
            String texto = "Produto;Quantidade;Preço\n";
            byte[] arrayDeBytes = texto.getBytes();
            fos.write(arrayDeBytes);
            for(int i = 0; i < 3; i++) {
                String produto = JOptionPane.showInputDialog("Qual o produto?");
                String quantidade = JOptionPane.showInputDialog("Qual a quantidade?");
                String preco = JOptionPane.showInputDialog("Qual o preço?");
                texto = produto+";"+quantidade+";"+preco+"\n";
                arrayDeBytes = texto.getBytes();
                fos.write(arrayDeBytes);
            }
            fos.close();
        } catch(FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
        } catch(IOException ioe) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura do arquivo.");
        }
        
    }
}
