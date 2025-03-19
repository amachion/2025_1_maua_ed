public class ListaSimplesCopia {
    private No primeiro;

    // usaremos o construtor padrão que "zera" o ponteiro, isto é, null
    public boolean estaVazia() {
        return primeiro == null;
    }

    public void insereInicio(int elemento) {
        No novo = new No(elemento);
        if (!estaVazia())
            novo.setProximo(primeiro);
        primeiro = novo;
    }

    public int removeInicio() {
        if (estaVazia())
            throw new RuntimeException("lista vazia");
        int removido = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return removido;
    }

    @Override
    public String toString() {
        String s = "lista: ";
        if (estaVazia()) {
            s = s + "vazia";
        } else {
            No runner = primeiro;
            while (runner != null) { // até o FINAL da lista
                s = s + runner + "->";
                runner = runner.getProximo();
            }
            s = s + "\\\\";
        }
        return s + "\n";
    }

    public void insereFim(int elemento) {
        No novo = new No(elemento);
        if (estaVazia()) {
            primeiro = novo;
        } else {
            No runner = primeiro;
            while (runner.getProximo() != null) {// até o último da lista
                runner = runner.getProximo();
            }
            runner.setProximo(novo);
        }
    }
}
