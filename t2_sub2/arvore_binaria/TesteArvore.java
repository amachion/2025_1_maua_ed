import java.util.Random;
public class TesteArvore {
    public static void main(String[] args) {
        Random random = new Random();
        ArvoreBinaria abb = new ArvoreBinaria();
        ArvoreBinaria abbOcorrencias = new ArvoreBinaria();
        for (int i=1; i<=12; i++) {
            int n = random.nextInt(10);
            System.out.print(n + " ");
            abb.insere(n);
            abbOcorrencias.insereComOcorrencias(n);
        }
        System.out.println("\n" + abb);
        System.out.println("\n" + abbOcorrencias);
        System.out.println("\naltura com repeticao de nos: " + abb.altura());
        System.out.println("altura com ocorrencias: " + abbOcorrencias.altura());
    }
}
