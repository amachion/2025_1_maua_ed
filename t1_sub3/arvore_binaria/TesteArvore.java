import java.util.Random;

public class TesteArvore {
    public static void main(String[] args) {
        Random random = new Random();
        ArvoreBinaria abb = new ArvoreBinaria();
        ArvoreBinaria abbZip = new ArvoreBinaria();
        for (int i=1; i<=10; i++) {
            int n = random.nextInt(10);
            abb.insere(n);
            abbZip.insereRepeticao(n);
            System.out.print(n + " ");
        }
        System.out.println("arvore original:\n" + abb);
        System.out.println("\narvore compactada:\n" + abbZip);

        System.out.println("altura da arvore original: " + abb.altura());
        System.out.println("altura da arvore compactada: " + abbZip.altura());

        try {
            abb.removeValor(10);
        }
        catch (RuntimeException rt) {
            System.out.println(rt.getMessage());
        }
        System.out.println("foi");
    }
}
