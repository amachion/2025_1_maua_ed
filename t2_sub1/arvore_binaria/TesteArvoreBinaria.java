import java.util.Random;
public class TesteArvoreBinaria {
    public static void main(String[] args) {
        Random random = new Random();
        ArvoreBinaria abb = new ArvoreBinaria();
        ArvoreBinaria abbOcorrencias = new ArvoreBinaria();
        for (int i=1; i <= 200; i++) {
            int n = random.nextInt(100);
            System.out.print(n + " ");
            abb.insere(n);
            abbOcorrencias.insereComOcorrencias(n);
        }
        System.out.println("\narvore com repeticao\n" + abb);
        System.out.println("\narvore sem repeticao\n" + abbOcorrencias);
    }
}
