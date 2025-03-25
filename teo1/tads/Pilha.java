public class Pilha {
    private int topo;
    private int[] dados;
    public Pilha () {
        this(10);
    }
    public Pilha (int capacidade) {
        topo = 0;
        dados = new int[capacidade];
    }
    public boolean pilhaVazia () {
        return topo == 0;
    }
    public boolean pilhaCheia () {
        return topo == dados.length;
    }
    public boolean push (int elemento) {
        if (pilhaCheia()) return false;
        dados[topo++] = elemento;
        return true;
    }
    public int pop () {
        if (pilhaVazia()) return -1;
        return dados[--topo];
    }
    public int peek () {
        if (pilhaVazia()) return -1;
        return dados[topo-1];
    }
}
