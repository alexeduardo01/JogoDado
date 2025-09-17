package jogoDado;
import java.util.Random;

public class Dado {
    private int numeroDeLados;
    private Random random = new Random();

    public Dado(int numeroDeLados) {
        if (numeroDeLados < 2) {
            throw new IllegalArgumentException("Dado deve ter no mínimo 2 lados");
        }
        this.numeroDeLados = numeroDeLados;
    }

    public int rolar() {
        return random.nextInt(numeroDeLados) + 1;
    }

    public int getNumeroDeLados() {
        return numeroDeLados;
    }
}
