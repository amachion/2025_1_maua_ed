import java.util.Random;
public class TesteFila {
    public static void main(String[] args) {
        Random random = new Random();
        Fila fila = new Fila();
        for (int i=1; i <= 20; i++) {
            try {
                if (random.nextBoolean()) 
                    fila.enfileira(i);
                else 
                    System.out.println(fila.desenfileira() + " saiu");
                System.out.println(fila);
            }
            catch (RuntimeException rt) {
                System.out.println(rt.getMessage());
            }
        }
    }
}
