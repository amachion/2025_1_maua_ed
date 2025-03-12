import java.util.Random;
public class NovoTesteVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor(4);
        // for (int i = 1; i <= 100; i++) {
        //     v1.insere(i);
        //     System.out.println("inseriu " + i + " tamanho = " + v1.getTamanho());
        // }
        // for (int i = 1; i <= 80; i++) {
        //     v1.remove();
        // }
        // System.out.println(v1);
        // System.out.println("tamanho = " + v1.getTamanho());

        Random r = new Random();
        for (int i=1; i<=200; i++) {
            if (r.nextBoolean()) {
                v1.insere(i);
            }
            else {
                v1.remove();
            }
            System.out.println(v1);
            System.out.println("tamanho = " + v1.getTamanho());
        }
    }
}
