public class ListaSimples {
    private No primeiro;
    private No ultimo;
    //usaremos o construtor padrão que "zera" os ponteiros, isto é, null
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int elemento) {
        No novo = new No(elemento);
        if (estaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    public int removeInicio() {
        if (estaVazia()) throw new RuntimeException("lista vazia, nao ha o que remover");
        int removido = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) { //esvaziou a lista
            ultimo = null; //precisa liberar a memória
        }
        return removido;
    }
    @Override
    public String toString() {
        String s = "lista: ";
        if (estaVazia()) {
            s = s + "vazia";
        }
        else {
            No runner = primeiro;
            while (runner != null) { //até o FINAL da lista
                s = s + runner + "->";
                runner = runner.getProximo();
            }
            s = s + "\\\\";
        }
        return s + "\n";
    }
    public void insereFim (int elemento) {
        No novo = new No(elemento);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public int removeFim () {
        if (estaVazia()) throw new RuntimeException("lista vazia, nao ha o que remover");
        int removido = ultimo.getInfo();
        if (primeiro == ultimo) { //tem um só, vai esvaziar
            primeiro = null;
            ultimo = null;
        }
        else {
            No runner = primeiro;
            while (runner.getProximo() != ultimo) //procuramos o penúltimo
                runner = runner.getProximo();
            runner.setProximo(null);
            ultimo = runner;
        }
        return removido;
    }
    public void inserePosicao (int elemento, int posicao){
        //busca a posição e faz a inserção do elemento
        //a primeira posição é 1
    }
    public boolean removeElemento (int elemento) {
        //busca o elemento e o remove da lista se o encontrar
    }
}
