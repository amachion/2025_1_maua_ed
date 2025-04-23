public class ArvoreBinaria {
    private No raiz;
    //construtor padrão
    public boolean arvoreVazia () {
        return raiz == null;
    }
    public void insere (int info) {
        No novo = new No(info);
        if (arvoreVazia())
            raiz = novo;
        else 
            insereRec(novo, raiz);
    }
    void insereRec (No novo, No atual) {
        if (novo.getInfo() > atual.getInfo()) {
            if (atual.getDireita() == null)
                atual.setDireita(novo);
            else
                insereRec(novo, atual.getDireita());
        }
        else {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(novo);
            else
                insereRec(novo, atual.getEsquerda());
        }
    }
    //percurso em ordem para criar o toString
    @Override
    public String toString() {
        if (arvoreVazia()) return "arvore vazia";
        return stringEmOrdemRec(raiz);
    }
    String stringEmOrdemRec (No atual) {
        String s = "";
        if (atual.getEsquerda() != null)
            s += stringEmOrdemRec(atual.getEsquerda());
        s += atual + " ";
        if (atual.getDireita() != null)
            s += stringEmOrdemRec(atual.getDireita());
        return s;
    }
    public void insereRepeticao (int info) {
        NoRepeticao novo = new NoRepeticao(info);
        if (arvoreVazia()) raiz = novo;
        else insereRepeticaoRec(novo, raiz);
    }
    void insereRepeticaoRec (No novo, No atual) {
        NoRepeticao noAtualRepeticao = (NoRepeticao)atual; 
        if (atual.getInfo() == novo.getInfo())
            noAtualRepeticao.setOcorrencias(noAtualRepeticao.getOcorrencias() + 1);
        else if (novo.getInfo() > atual.getInfo()) {
            if (atual.getDireita() == null)
                atual.setDireita(novo);
            else 
                insereRepeticaoRec(novo, atual.getDireita());
        }
        else {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(novo);
            else 
                insereRepeticaoRec(novo, atual.getEsquerda());
        } 
    }
}
 