import java.util.ArrayList;
import java.util.List;

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
    public boolean isEmpty() {
        for (int i=0; i<capacidade; i++)
            if (tabela[i] != null)
                return false;
        return true;
    }
    public int size() {
        int s=0;
        for (int i=0; i<capacidade; i++) {
            Entrada<K,V> atual = tabela[i];
            while (atual != null) {
                s++;
                atual = atual.proximo;                
            }
        }
        return s;
    }
    public boolean containsKey (K key) {
        int indice = hash(key);
        Entrada<K, V> atual = tabela[indice];
        while (atual != null) {
            if (atual.key.equals(key))
                return true;
            atual = atual.proximo;
        }
        return false;
    }
    public boolean containsValue (V value) {
        for (int i=0; i<capacidade; i++) {
            Entrada<K, V> atual = tabela[i];
            while (atual != null) {
                if (atual.value.equals(value))
                    return true;
                atual = atual.proximo;
            }
        }
        return false;
    }
    public List<V> getListaValores (K key) {
        int indice = hash(key);
        List<V> lista = new ArrayList<>();
        Entrada<K, V> atual = tabela[indice];
        while (atual != null) {
            if (key.equals(atual.key)) 
                lista.add(atual.value);
            atual = atual.proximo;
        }
        return lista;
    }
}
