import java.util.Random;
public class NovoTeste {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        Random random = new Random();
        for (int i=1; i<=20; i++) {
            if (random.nextBoolean())
                v.insere(i);
            else
                try {
                    System.out.println(v.remove() + " foi removido");
                }
                catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            System.out.println("tamanho = " + v.getTamanho());
            System.out.println(v);
        }
        if (v.contem(10)) {
            System.out.println("10 esta no vetor");
        }
        else {
            System.out.println("10 nao esta no vetor");
        }
        // int posicao = v.indiceDe(10);
        // if (posicao == -1) {
        //     System.out.println("de fato, 10 nao esta no vetor");
        // }
        // else {
        //     System.out.println("10 esta na posicao " + posicao);
        // }
        try {
            System.out.println("10 encontrado na posicao " + v.indiceDe(10));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
