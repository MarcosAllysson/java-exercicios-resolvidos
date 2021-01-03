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
public class LeArquivoBinario {
    public static void main(String[] args) {
        File arquivo = new File("arquivo.bin");
        try {
            FileInputStream fis = new FileInputStream(arquivo);
            DataInputStream dis = new DataInputStream(fis);
            double d = dis.readDouble();
            System.out.println(d);
            byte b = dis.readByte();
            System.out.println(b);
            int i = dis.readInt();
            System.out.println(i);
            String s = dis.readUTF();
            System.out.println(s);
            boolean bo = dis.readBoolean();
            System.out.println(bo);
            char c = dis.readChar();
            System.out.println(c);
            fis.close();
        } catch(FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
        } catch(IOException ioe) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura do arquivo.");
        }
    }
}
