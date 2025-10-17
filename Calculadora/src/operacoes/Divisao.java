package operacoes;

public class Divisao {

    public static float divisao(float a, float b) {
        if (b == 0) {
            return 0; // Evita divisão por zero
        }
        return a / b;
    }

}
