public class NossoHash <K, V>{
    private Entrada <K, V> [] tabela;
    private int capacidade=10;
    @SuppressWarnings("unchecked")
    public NossoHash() {
        tabela = new Entrada[capacidade];
    }
    private int hash (K key) {
        return Math.abs(key.hashCode()) % capacidade;
    }
    public void put (K key, V value) {
        //inserção de início na lista
        int indice = hash(key);
        Entrada<K, V> nova = new Entrada<>(key, value);
        nova.proximo = tabela[indice];
        tabela[indice] = nova;
    }
    public void imprime () {
        for (int i=0; i<capacidade; i++) {
            System.out.println("posicao " + i);
            Entrada<K, V> atual = tabela[i];
            while (atual != null) {
                System.out.println("chave: " + atual.key + ", valor: " + atual.value);
                atual = atual.proximo;
            }
            System.out.println("\\\\");
        }
    }
    public V get (K key) {
        int indice = hash(key);
        Entrada<K, V> atual = tabela[indice];
        while (atual != null) {
            if (atual.key.equals(key))
                return atual.value;
            atual = atual.proximo;
        }
        return null;
    }
}
