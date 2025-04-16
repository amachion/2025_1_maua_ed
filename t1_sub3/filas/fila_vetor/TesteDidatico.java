import java.util.Random;

public class TesteDidatico {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Random random = new Random();
        for (int i = 1; i<=100; i++) {
            try {
                if (random.nextBoolean()) {
                    fila.enfileira(random.nextInt(10));
                }
                else {
                    System.out.println(fila.desenfileira() + " saiu");
                }
                System.out.println(fila);
                System.out.println(fila.stringVetor());
            }
            catch (RuntimeException rt) {
                
            }
        }
    }
}
