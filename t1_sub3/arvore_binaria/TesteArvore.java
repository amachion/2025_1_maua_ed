import java.util.Random;

public class TesteArvore {
    public static void main(String[] args) {
        Random random = new Random();
        ArvoreBinaria abb = new ArvoreBinaria();
        ArvoreBinaria abbZip = new ArvoreBinaria();
        for (int i=1; i<=100; i++) {
            int n = random.nextInt(100);
            abb.insere(n);
            abbZip.insereRepeticao(n);
            //System.out.print(n + " ");
        }
        System.out.println("arvore original:\n" + abb);
        System.out.println("\narvore compactada:\n" + abbZip);
    }
}
