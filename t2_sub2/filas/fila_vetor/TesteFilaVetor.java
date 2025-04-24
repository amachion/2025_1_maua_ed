import java.util.Random;

public class TesteFilaVetor {
    public static void main(String[] args) {
        Random random = new Random();
        Fila fila = new Fila(8);
        for (int i=1; i<=20; i++) {
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
