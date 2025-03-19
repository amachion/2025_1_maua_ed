public class ListaSimples {
    private No primeiro;
    //vamos utilizar o construtor padrão, ou seja, tudo zerado (null)
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int elemento) {
        No novo = new No(elemento);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    public int removeInicio () {
        if (estaVazia()) throw new RuntimeException("lista vazia, nao ha o que remover");
        int removido = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return removido;
    }
    @Override
    public String toString() {
        String s = "lista: ";
        if (estaVazia()) {
            s += "vazia";
        }
        else {
            No runner = primeiro;
            while (runner != null) {
                s += runner + "->";
                runner = runner.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
}
