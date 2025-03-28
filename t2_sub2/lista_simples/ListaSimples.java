public class ListaSimples {
    private No primeiro;
    private No ultimo;
    //usaremos o construtor padrão, isto é, primeiro = null e ultimo = null
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        No novo = new No(info);
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
        int removido = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) { //esvaziou a lista
            ultimo = null;
        }
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
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public int removeFim() {
        if (estaVazia())
            throw new RuntimeException("lista vazia, nao ha o que remover");

        int removido = ultimo.getInfo();
        if (primeiro == ultimo) { //tem um elemento só
            primeiro = null;
            ultimo = null;
        }
        else {
            No runner = primeiro;
            while (runner.getProximo() != ultimo) { //vai até o penúltimo
                runner = runner.getProximo();
            }
            runner.setProximo(null);
            ultimo = runner;
        }
        return removido;
    }
}
