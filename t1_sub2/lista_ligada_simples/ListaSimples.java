public class ListaSimples {
    private No primeiro;
    private No ultimo;
    //vamos usar o construtor padrão: primeiro e último = null
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio(int elemento) {
        No novo = new No(elemento);
        if (estaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    public int removeInicio () {
        if (estaVazia())
            throw new RuntimeException("lista vazia, nao ha o que remover");
        int elemento = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) {//esvaziou a lista
            ultimo = null;
        }
        return elemento;
    }
    @Override
    public String toString() {
        String s = "lista: ";
        if (estaVazia()) {
            s += "esta vazia";
        }
        else {
            No runner = primeiro;
            while (runner != null) { //vai até o finaaaalll da lista
                s += runner + "->";
                runner = runner.getProximo();
            }
            s += "\\\\";
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
        if (estaVazia())
            throw new RuntimeException("Lista vazia, não há o que remover");
        int elemento = ultimo.getInfo();
        if (primeiro == ultimo) {//tem um só, vai esvaziar a lista
            primeiro = null;
            ultimo = null;
        }
        else {
            No runner = primeiro;
            while (runner.getProximo() != ultimo)//percorre até o penúltimo
                runner = runner.getProximo();
            runner.setProximo(null);
            ultimo = runner;
        }
        return elemento;
    }
}