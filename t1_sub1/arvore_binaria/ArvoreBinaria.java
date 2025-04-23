public class ArvoreBinaria {
    private No raiz;
    //construtor padrão: raiz = null
    public boolean arvoreVazia() {
        return raiz == null;
    }
    public void insere (int info) {
        No novo = new No(info);
        if (arvoreVazia())
            raiz = novo;
        else 
            insereRec(novo, raiz);
    }
    private void insereRec (No novo, No atual) {
        if (novo.getInfo() > atual.getInfo()) {
            if (atual.getDireita() == null)
                atual.setDireita(novo);
            else {
                insereRec(novo, atual.getDireita());
            }
        }
        else {
            if (atual.getEsquerda() == null) 
                atual.setEsquerda(novo);
            else
                insereRec(novo, atual.getEsquerda());
        }
    }
}
