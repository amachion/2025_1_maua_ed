public class ListaSimplesCopia {
    private No primeiro;
    //usaremos o construtor padrão, isto é, primeiro = null
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        No novo = new No(info);
        if (!estaVazia()) {
           novo.setProximo(primeiro); 
        }
        primeiro = novo;
    }
    public int removeInicio () {
        if (estaVazia()) 
            throw new RuntimeException("lista vazia, nao ha o que remover");
        int removido = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return removido;
    }
    @Override
    public String toString() {
        String s = "lista: ";
        if (estaVazia()) {
            s += "esta vazia";
        }
        else {
            No runner = primeiro;
            while (runner != null) {//vai até o finaaaallll da lista
                s += runner + "->";
                runner = runner.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
    public void insereFim (int info) {
        No novo = new No(info);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            No runner = primeiro;
            while (runner.getProximo() != null) {//vai até o último da lista
                runner = runner.getProximo();
            }
            runner.setProximo(novo);
        }
    }
}
