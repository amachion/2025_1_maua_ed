public class Entrada<K, V> {
    K key;
    V value;
    Entrada<K, V> proximo;
    public Entrada(K key, V value) {
        this.key = key;
        this.value = value;
        this.proximo = null;
    }
}