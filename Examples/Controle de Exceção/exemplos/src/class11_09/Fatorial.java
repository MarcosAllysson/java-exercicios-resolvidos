public class Fatorial {
    public Fatorial() {
    }
    
    public int chamaCalculo(int i) throwsNumeroInvalidoException {
        Calculo c = new Calculo()
        int resultado = c.calculaFatorial(i);
        return resultado;
    }
    
    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        for (int x = 0; x < 10; x++) {
            try {
                System.out.println("Fatorial de "+(8-x)+": "+f.chamaCalculo(8-x));
            } catch (NumeroInvalidoException nie) {
                System.out.println(nie.getMessage());
            }
        }
        
    }
    
}

class Calculo {
    public int calculaFatorial(int i) throws NumeroInvalidoException {
        int resultado = 1;
        if (i <= 0) {
            throw new NumeroInvalidoException();
        } else if (i == 1) {
            resultado = 1;
        } else {
            resultado *= calculaFatorial(i-1);
        }
        return resultado;
    }
}

class NumeroInvalidoException extends Exception {
    public String getMessage() {
        return "O número deve ser um inteiro positivo maior que zero.";
    }
}