public class Fila {
    int[] dados;
    int primeiro, ultimo, ocupacao;
    public Fila (int capacidade) {
        dados = new int[capacidade];
        primeiro = 0;
        ultimo = 0;
        ocupacao = 0;
    }
    public Fila () {
        this(10);
    }
    public boolean filaVazia () {
        return ocupacao == 0;
    }
    public boolean filaCheia () {
        return ocupacao == dados.length;
    }
    private int proxima (int pos) {
        return (pos + 1) % dados.length;
    }
    public void enfileira (int e) {
        if (filaCheia()) throw new RuntimeException("falha na insercao");
        dados[ultimo] = e;
        ultimo = proxima(ultimo);
        ocupacao++;
    }
    public int desenfileira () {
        if (filaVazia()) throw new RuntimeException ("falha na remocao");
        int temp = dados[primeiro];
        primeiro = proxima(primeiro);
        ocupacao--;
        return temp; 
    }
    @Override
    public String toString() {
        if (filaVazia()) return ("fila vazia");
        String s = "";
        for (int i=primeiro, cont=0; cont < ocupacao; cont++) {
            s = s + dados[i] + " ";
            i = proxima(i);
        }
        return s;
    }
    public String stringVetor () {
        String s = "";
        if (filaVazia())
            for (int i=0; i<dados.length; i++) 
                s += "_ ";
        else if (filaCheia())
            for (int i=0; i<dados.length; i++)
                s += dados[i] + " ";
        else if (primeiro < ultimo) {
            for (int i=0; i<primeiro; i++)
                s += "_ ";
            for (int i=primeiro; i<ultimo; i++)
                s += dados[i] + " ";
            for (int i=ultimo; i<dados.length; i++)
                s += "_ ";
        }
        else {
            for (int i=0; i<ultimo; i++)
                s += dados[i] + " ";
            for (int i=ultimo; i<primeiro; i++)
                s += "_ ";
            for (int i=primeiro; i<dados.length; i++)
                s += dados[i] + " ";
        }
        return s + "\n";
    }
}