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
public class LeituraArquivoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File arquivo = new File("arquivo.txt");
        byte[] arrayDeBytes = new byte[(int)arquivo.length()];
        try {
            FileInputStream fis = new FileInputStream(arquivo);
            fis.read(arrayDeBytes);
            fis.close();
        } catch(FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
        } catch(IOException ioe) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura do arquivo.");
        }
        String texto = new String(arrayDeBytes);
        System.out.println(texto);
    }
    
}
