public class Fila {
    private No primeiro;
    private No ultimo;
    //construtor padrão
    public boolean filaVazia() {
        return primeiro == null;
    }
    public void enfileira (int info) {
        No novo = new No(info);
        if (filaVazia())
            primeiro = novo;
        else 
            ultimo.setProximo(novo);
        ultimo =  novo;
    }
    public int desenfileira () {
        if (filaVazia()) throw new RuntimeException("falha no desenfileiramento");
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) //esvaziou a fila
            ultimo = null; //corta todas as referências
        return temp;
    }
    @Override
    public String toString () {
        if (filaVazia()) return "fila vazia";
        String s = "";
        No runner = primeiro;
        while (runner != null) {
            s += runner + " -> ";
            runner = runner.getProximo();
        }
        return s + "\\\\";
    }
}
class No {
    private int info;
    private No proximo;
    public No(int info) {
        this.info = info;
    }
    public int getInfo() {
        return info;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString () {
        return "[" + info + "]";
    }
}