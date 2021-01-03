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
public class EscreveArquivoBinario {
    public static void main(String[] args) {
        int i = 51;
        double d = Math.PI;
        byte b = 98;
        String s = "Comer é uma expressão da vida: Só come quem vive e só vive quem come.";
        boolean bo = false;
        char c = 'J';
        File arquivo = new File("arquivo.bin");
        try{
            FileOutputStream fos = new FileOutputStream(arquivo);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(i);
            dos.writeDouble(d);
            dos.writeByte(b);
            dos.writeUTF(s);
            dos.writeBoolean(bo);
            dos.writeChar(c);
            fos.close();
        } catch(FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
        } catch(IOException ioe) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura do arquivo.");
        }
    }
}
