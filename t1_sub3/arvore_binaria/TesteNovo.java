public class TesteNovo {
    public static void main(String[] args) {
        ArvoreBinaria a = new ArvoreBinaria();
        a.insere(3);
        a.insere(2);
        a.insere(6);
        a.insere(4);
        a.insere(5);
        System.out.println(a.altura());
    }
}
