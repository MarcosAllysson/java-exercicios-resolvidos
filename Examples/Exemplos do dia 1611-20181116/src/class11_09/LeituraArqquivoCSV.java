/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos20181116;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author yoda
 */
public class LeituraArqquivoCSV {
    public static void main(String[] args) {
        // TODO code application logic here
        File arquivo = new File("calc.csv");
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
        String[][] matriz = new String[14][4];
        StringTokenizer st = new StringTokenizer(texto, "\n");
        for(int i = 0; i < 14; i++) {
            String linha = st.nextToken();
            StringTokenizer st1 = new StringTokenizer(linha, ";");
            for(int j = 0; j < 4; j++) {
                matriz[i][j] = st1.nextToken();
            }
        }
        for(int i = 0; i< 14; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }
}
