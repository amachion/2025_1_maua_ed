import java.util.Random;

public class NovoTeste {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        Random random = new Random();
        for (int i = 1; i <= 20; i++) {
            if (random.nextBoolean()) {
                v.inserir(i);
                System.out.println("inserido " + i);
            }
            else {
                try {
                    System.out.println(v.remover() + " foi removido");
                }
                catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("tamanho = " + v.getTamanho());
            System.out.println(v);
        }
        if (v.contem(10))
            System.out.println("10 esta no vetor");
        else 
            System.out.println("10 nao esta no vetor");

        int p = v.indiceDe(10);
        if (p == -1)
            System.out.println("10 nao esta no vetor");
        else
            System.out.println("10 esta na posicao " + p);
    }
}
