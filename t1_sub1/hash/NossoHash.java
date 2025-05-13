
public class NossoHash <K, V>{
    private Entrada <K, V> [] tabela;
    private int capacidade = 10;
    @SuppressWarnings("unchecked")
    public NossoHash() {
        tabela = new Entrada[capacidade];
    }
    private int hash (K chave) {
        return Math.abs(chave.hashCode()) % capacidade;
    }
    public void put (K chave, V valor) {
        int indice = hash(chave);
        Entrada<K, V> novo = new Entrada<>(chave, valor);
        novo.proximo = tabela[indice];
        tabela[indice] = novo;
    }
    public V get (K chave) {
        int indice = hash(chave);
        Entrada<K, V> atual = tabela[indice];
        while (atual != null) {
            if (atual.chave.equals(chave))
                return atual.valor;
            atual = atual.proximo;
        }
        return null;
    }
    public boolean remove (K chave) {
        int indice = hash(chave);
        Entrada<K, V> atual = tabela[indice];
        if (atual.chave.equals(chave)) {
            tabela[indice] = atual.proximo;
            return true;
        }
        Entrada<K, V> anterior = atual;
        atual = atual.proximo;
        while (atual != null) {
            if (atual.chave.equals(chave)) {
                anterior.proximo = atual.proximo;
                return true;
            }
            anterior = atual;
            atual = atual.proximo;
        }
        return false;
    }
    public void imprime () {
        for (int i=0; i<capacidade; i++) {
            Entrada<K, V> atual = tabela[i];
            System.out.println("posicao " + i);
            while (atual != null) {
                System.out.println("{chave: " + atual.chave + ", valor: " + atual.valor + "}");
                atual = atual.proximo;
            }
            System.out.println("\\\\");
        }
    }
}
