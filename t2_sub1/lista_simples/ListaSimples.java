public class ListaSimples {
    private No primeiro;
    private No ultimo;
    //vamos utilizar o construtor padrão, ou seja, tudo zerado (null)
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
    public int removeInicio () {
        if (estaVazia()) throw new RuntimeException("lista vazia, nao ha o que remover");
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
            s += "vazia";
        }
        else {
            No runner = primeiro;
            while (runner != null) { //varre até o FINAL da lista
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
            throw new RuntimeException("lista vazia, nao ha o que remover");
        int removido = ultimo.getInfo();
        if (primeiro == ultimo) { //existe um único elemento na lista
            primeiro = null;
            ultimo = null;
        }
        else {
            No runner = primeiro;
            while (runner.getProximo() != ultimo) { //vai até o penúltimo da lista
                runner = runner.getProximo();
            }
            runner.setProximo(null);
            ultimo = runner;
        }
        return removido;
    }

    public int getTamanho() {
        //retorna o tamanho da lista
        if (estaVazia()) return 0;
        No runner = primeiro;
        int cont = 1;
        while (runner != null) {
            cont++;
            runner = runner.getProximo();
        }
        return cont;
    }
    public void inserePosicao (int elemento, int posicao) {
        //insere o elemento na posição pedida
        //considere a primeira como posição 1
        //se posicao < 1 -> insere no inicio
        //se podicao > tamanho -> insere no final
        //cenário 1: lista vazia ou posição <= 1
        if (estaVazia() || posicao <= 1) {
            insereInicio(elemento);
        }
        else {
            int pos = 1;
            No runner = primeiro;
            while (runner != null && pos < posicao-1) {
                runner = runner.getProximo();
                pos++;
            }
            //descobrir o porque saiu do laço
            if (runner == null) {
                insereFim(elemento);
            }
            else {
                No novo = new No(elemento);
                novo.setProximo(runner.getProximo());
                runner.setProximo(novo);
            }
        }
    }
    public boolean removeElemento(int elemento) {
        //encontra a primeira ocorrencia do elemento e remove da lista, retornando sucess
        //se não encontrar, retorna fracasso
        if (primeiro.getInfo() == elemento) {
            removeInicio();
            return true;
        }
        No anterior = primeiro;
        No atual = primeiro.getProximo();
        while (atual != null && atual.getInfo() != elemento) {
            anterior = atual;
            atual = atual.getProximo();
        }
        //por que saiu do laço?
        if (atual == null) return false;
        //achou o elemento na posição atual
        anterior.setProximo(atual.getProximo());
        return true;
    }
}
