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
        if (arvoreVazia()) 
            raiz = new NoRepeticao(info);
        else insereRepeticaoRec(info, raiz);
    }
    void insereRepeticaoRec (int info, No atual) {
        NoRepeticao noAtualRepeticao = (NoRepeticao)atual; 
        if (atual.getInfo() == info)
            noAtualRepeticao.incrementaOcorrencias();
        else if (info > atual.getInfo()) {
                if (atual.getDireita() == null)
                    atual.setDireita(new NoRepeticao(info));
                else 
                    insereRepeticaoRec(info, atual.getDireita());
        }
        else {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(new NoRepeticao(info));
            else 
                insereRepeticaoRec(info, atual.getEsquerda()); 
        }
    }
    public int altura () {
        if (arvoreVazia() || raiz.getEsquerda()==null && raiz.getDireita()==null) return 0;
        return alturaRec(raiz);
    }
    private int alturaRec (No atual) {
        if (atual.getEsquerda()==null && atual.getDireita()==null)
            return 0;
        int alturaEsquerda=0, alturaDireita=0;
        if (atual.getEsquerda() != null)
            alturaEsquerda = alturaRec(atual.getEsquerda());
        if (atual.getDireita() != null)
            alturaDireita = alturaRec(atual.getDireita());
        return alturaDireita > alturaEsquerda ? alturaDireita + 1 : alturaEsquerda + 1;
    }
    public void removeValor (int info) {
        if (arvoreVazia()) throw new RuntimeException ("falha na remocao");
        if (info == raiz.getInfo()) {
            if (raiz.getDireita() == null && raiz.getEsquerda() == null) {
                raiz = null;
            }
            else if (raiz.getEsquerda() == null) {
                raiz = raiz.getDireita();
            }
            else if (raiz.getDireita() == null) {
                raiz = raiz.getEsquerda();
            }
            else {
                No suc = sucessor(raiz);
                suc.setEsquerda(raiz.getEsquerda());
                raiz = suc;
            }
        }
        else {
            if (info > raiz.getInfo())
                removeValorRec(info, raiz.getDireita(), raiz, true);
            else 
                removeValorRec(info, raiz.getEsquerda(), raiz, false);
        }
    }
    private void removeValorRec (int info, No atual, No pai, boolean efilhoDireita) {
        if (info == atual.getInfo()) {
            if (atual.getDireita() == null && atual.getEsquerda() == null) {
                if (efilhoDireita)
                    pai.setDireita(null);
                else 
                    pai.setEsquerda(null);
            }
            else if (atual.getDireita() == null) {
                //tem só o filho da esquerda
                if (efilhoDireita)
                    pai.setDireita(atual.getEsquerda());
                else 
                    pai.setEsquerda(atual.getEsquerda());
            }
            else if (atual.getEsquerda() == null) {
                //tem só o filho da direita
                if (efilhoDireita)
                    pai.setDireita(atual.getDireita());
                else
                    pai.setEsquerda(atual.getDireita());
            }
            else {
                //tem os 2 filhos
                //encontrar o sucessor deste nó: o menor valor maior que o atual
                No suc = sucessor(atual);
                suc.setEsquerda(atual.getEsquerda());
                if (efilhoDireita)
                    pai.setDireita(suc);
                else 
                    pai.setEsquerda(suc);
            }
        }
        else {
            if (info > atual.getInfo())
                removeValorRec(info, atual.getDireita(), atual, true);
            else
                removeValorRec(info, atual.getEsquerda(), atual, false);
        }
    }
    private No sucessor (No atual) {
        No suc = atual.getDireita();
        No runner = suc.getEsquerda();
        No pai = suc;
        while (runner != null) {
            pai = suc;
            suc = runner;
            runner = runner.getEsquerda();
        }
        if (suc != atual.getDireita()) {
            pai.setEsquerda(suc.getDireita());
            suc.setDireita(atual.getDireita());
        }
        return suc;
    }
    public int contaNos() {
        if (arvoreVazia()) return 0;
        return contaNosRec1(raiz);
    }
    private int contaNosRec1(No atual) {
        int nos=0;
        if (atual.getEsquerda() != null) 
            nos += contaNosRec1(atual.getEsquerda());
        if (atual.getDireita() != null) 
            nos += contaNosRec1(atual.getDireita());
        return nos + 1;
    }
    private int contaNosRec2 (No atual) {
        if (atual != null)
            return contaNosRec2(atual.getEsquerda()) + contaNosRec2(atual.getDireita()) + 1;
        return 0;
    }
}
 