import java.util.Random;
public class TesteArvoreBinaria {
    public static void main(String[] args) {
        Random random = new Random();
        ArvoreBinaria abb = new ArvoreBinaria();
        ArvoreBinaria abbOcorrencias = new ArvoreBinaria();
        for (int i=1; i <= 120; i++) {
            int n = random.nextInt(10);
            System.out.print(n + " ");
            abb.insere(n);
            abbOcorrencias.insereComOcorrencias(n);
        }
        System.out.println("\narvore com repeticao\n" + abb);
        System.out.println("\narvore sem repeticao\n" + abbOcorrencias);
        System.out.println("\naltura sem ocorrencias: " + abb.altura());
        System.out.println("\naltura com ocorrencias: " + abbOcorrencias.altura());

    }
}
