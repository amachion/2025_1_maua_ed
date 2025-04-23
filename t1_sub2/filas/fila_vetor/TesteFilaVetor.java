import java.util.Random;

public class TesteFilaVetor {
    public static void main(String[] args) {
        Fila fila = new Fila(8);
        Random random = new Random();
        for (int i=1; i<=50; i++) {
            try {
                if (random.nextBoolean()){
                    fila.enfileira(random.nextInt(10));
                }
                else {
                    System.out.println(fila.desenfileira() + " saiu");
                }
                System.out.println(fila);
                System.out.println(fila.stringVetor());
            }
            catch (RuntimeException rt) {
                System.out.println(rt.getMessage());
            }
        }
    }
}
