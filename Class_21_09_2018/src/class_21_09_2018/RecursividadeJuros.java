package exemplos20180927;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class RecursividadeJuros {
    public double juros(double montanteInicial, double taxaDeJuros, int meses) {
        // Caso base
        if(meses == 0) {
            return montanteInicial;
        // Relação de Recorrência
        } else {
            return juros(montanteInicial, taxaDeJuros, meses-1)*(1+taxaDeJuros);
        }
    }
    public static void main(String[] args) {
        double montanteInicial = Double.parseDouble(JOptionPane.showInputDialog("Insira o montante inicial:"));
        double taxaDeJuros = Double.parseDouble(JOptionPane.showInputDialog("Insira a taxa de juros:"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de meses:"));
        RecursividadeJuros rec = new RecursividadeJuros();
        double montanteFinal = rec.juros(montanteInicial, taxaDeJuros, meses);
        DecimalFormat df = new DecimalFormat("R$ #0.00");
        JOptionPane.showMessageDialog(null, "Ao final haverá "+df.format(montanteFinal));
    }
}
