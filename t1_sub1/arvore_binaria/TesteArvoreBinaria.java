import java.util.Random;

public class TesteArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria abb = new ArvoreBinaria();
        ArvoreBinaria abbOcorrencias = new ArvoreBinaria();
        Random random = new Random();
        for (int i=1; i<=200; i++) {
            int n = random.nextInt(100);
            System.out.print(n + " ");
            abb.insere(n);
            abbOcorrencias.insereOcorrencias(n);
        }
        System.out.println();
        System.out.println(abb);
        System.out.println();
        System.out.println(abbOcorrencias);
        System.out.println();
        System.out.println("altura da arvore com repeticoes: " + abb.altura());
        System.out.println("altura da arvore sem repeticoes: " + abbOcorrencias.altura());
        try {
            if (abb.remove(50))
                System.out.println("50 removido");
            else 
                System.out.println("50 não encontrado");
        }
        catch (RuntimeException rt) {
            System.out.println(rt.getMessage());
        }
        System.out.println("arvore depois da remocao:\n" + abb);
    }
}
