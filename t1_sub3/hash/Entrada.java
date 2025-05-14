public class Entrada <K, V> {
    K chave;
    V valor;
    Entrada<K, V> proximo;

    public Entrada (K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
        this.proximo = null;
    }
}