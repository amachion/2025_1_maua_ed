import java.util.Random;

public class TesteArvore {
    public static void main(String[] args) {
        Random random = new Random();
        ArvoreBinaria abb = new ArvoreBinaria();
        for (int i=1; i<=12; i++) {
            int n = random.nextInt(10);
            System.out.print(n + " ");
            abb.insere(n);
        }
        System.out.println("\n" + abb);
    }
}
