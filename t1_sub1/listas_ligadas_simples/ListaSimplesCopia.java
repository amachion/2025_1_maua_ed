public class ListaSimplesCopia {
    private No primeiro;
    //vamos usar o construtor padrão, isto é, primeiro = null
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio(int elemento) {
        No novo = new No(elemento);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    public int removeInicio () {
        if (estaVazia()) 
            throw new RuntimeException("lista vazia, nao ha o que remover");
        int elemento = primeiro.getInfo();
        primeiro = primeiro.getProximo();
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
            while (runner != null) { //percorre até o final da lista
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
            No runner = primeiro;
            while (runner.getProximo() != null) { //percorre até o último da lista
                runner = runner.getProximo();
            }
            runner.setProximo(novo);
        }
    }
}
