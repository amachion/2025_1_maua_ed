public class NossoHash <K, V>{
    private Entrada<K, V>[] tabela;
    private int capacidade = 16;   
    @SuppressWarnings("unchecked") 
    public NossoHash() {
        tabela = new Entrada[16];
    }
    private int hash (K key) {
        return Math.abs(key.hashCode()) % capacidade;
    }
    public void put (K key, V value) {
        int indice = hash(key);
        Entrada<K, V> entrada = new Entrada<>(key, value);
        entrada.proximo = tabela[indice];
        tabela[indice] = entrada;
    }
    public V get (K key) {
        int indice = hash(key);
        Entrada<K, V> atual = tabela[indice];
        while (atual != null) {
            if (key.equals(atual.key))
                return atual.value;
            atual = atual.proximo;
        }
        return null;
    }
    public void imprime() {
        for (int i=0; i<capacidade; i++) {
            System.out.println("posicao " + i);
            Entrada<K, V> atual = tabela[i];
            while (atual != null) {
                System.out.println("{chave: " + atual.key + ", valor: " + atual.value + "}");
                atual = atual.proximo;
            }
            System.out.println("\\\\");
        }
    }
}
