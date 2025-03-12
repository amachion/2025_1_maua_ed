public class OutroTesteVetor {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        for (int i = 1; i <= 100; i++) {
            v.insere(i);
            System.out.println("foi inserido " + i + ", tamanho = " + v.getTamanho());
        }
    }
}
