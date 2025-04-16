import java.util.Random;
//é o meeeessssmo teste
public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Random random = new Random();
        for (int i=1; i <= 20; i++) {
            try {
                if (random.nextBoolean()) {
                    fila.enfileira(i);
                }
                else {
                    System.out.println(fila.desenfileira() + " foi atendido");
                }
                System.out.println(fila);
            }
            catch (RuntimeException rt) {
                System.out.println(rt.getMessage());
            }
        }
    }
}
