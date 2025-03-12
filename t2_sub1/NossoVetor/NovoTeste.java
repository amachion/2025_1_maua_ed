import java.util.Random;

public class NovoTeste {
    public static void main(String[] args) {
        Random random = new Random();
        NossoVetor v = new NossoVetor(6);
        for (int i = 0; i <= 20; i++) {
            if (random.nextBoolean()) {
                v.insere(i);
                System.out.println(i + " foi inserido");
            }
            else {
                try {
                    System.out.println(v.remove() + " foi removido");
                }
                catch (RuntimeException e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("tamanho = " + v.getTamanho());
            System.out.println(v);
        }
        if (v.contem(8)) {
            System.out.println("8 esta no vetor");
        }
        else {
            System.out.println("8 nao esta no vetor");
        }
        try {
            System.out.println("8 esta na posicao " + v.indiceDe(8));
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
