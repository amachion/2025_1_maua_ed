public class OutroTesteVetor {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(4);
        for (int i=1; i<=100; i++) {
            v.inserir(i);
            System.out.println("inseriu " + i + ", tamanho = " + v.getTamanho());
        }
    }
}
