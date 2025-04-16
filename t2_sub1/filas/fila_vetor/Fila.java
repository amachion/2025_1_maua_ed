public class Fila {
    private int[] dados;
    private int primeiro, ultimo, ocupacao;
    public Fila (int capacidade) {
        dados = new int[capacidade];
        //por clareza
        primeiro = 0;
        ultimo = 0;
        ocupacao = 0;
    }
    public Fila () {
        this(10);
    }
    private int proxima (int pos) {
        return (pos+1) % dados.length;
    }
    public boolean filaVazia() {
        return ocupacao == 0;
    }
    public boolean filaCheia() {
        return ocupacao == dados.length;
    }
    public void enfileira (int e) {
        if (filaCheia()) throw new RuntimeException("falha na insercao");
        dados[ultimo] = e;
        ultimo = proxima(ultimo);
        ocupacao++;
    }
    public int desenfileira () {
        if (filaVazia()) throw new RuntimeException("falha na remocao");
        int temp = dados[primeiro];
        primeiro = proxima(primeiro);
        ocupacao--;
        return temp;
    }
    @Override
    public String toString () {
        if (filaVazia()) return "fila vazia";
        String s = "";
        for (int i=primeiro, cont=0; cont < ocupacao; cont++) {
            s += dados[i] + " ";
            i = proxima(i);
        }
        return s;
    }
}