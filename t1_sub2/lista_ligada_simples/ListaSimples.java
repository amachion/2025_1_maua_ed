public class ListaSimples {
    private No primeiro;
    //vamos usar o construtor padrão: primeiro = null
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
            throw new RuntimeException("lista vazia");
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
            while (runner != null) {
                s += runner + "->";
                runner = runner.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
}