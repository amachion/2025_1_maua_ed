import java.util.Random;

public class TesteDidatico {
    public static void main(String[] args) {
        Random random = new Random();
        Fila fila = new Fila(8);
        for (int i=1; i<=50; i++) {
            try {
                if (random.nextBoolean()) {
                    fila.enfileira(random.nextInt(10));
                }
                else {
                    fila.desenfileira();
                }
                System.out.println(fila);
                System.out.println(fila.toStringVetor());
            }
            catch (RuntimeException rt) {
                System.out.println(rt.getMessage());
            }
        }
    }
}
