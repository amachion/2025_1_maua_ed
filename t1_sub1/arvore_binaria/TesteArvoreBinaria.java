import java.util.Random;

public class TesteArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria abb = new ArvoreBinaria();
        Random random = new Random();
        for (int i=1; i<=100; i++) {
            int n = random.nextInt(100);
            System.out.print(n + " ");
            abb.insere(n);
        }
        System.out.println("\n" + abb);
    }
}
