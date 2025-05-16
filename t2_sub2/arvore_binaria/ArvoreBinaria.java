public class ArvoreBinaria {
    private No raiz;
    //construtor padrão
    public boolean arvoreVazia () {
        return raiz==null;
    }
    public void insere (int info) {
        No novo = new No(info);
        if (arvoreVazia())
            raiz = novo;
        else 
            insereRec (novo, raiz);
    }
    private void insereRec (No novo, No atual) {
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
    //a construção do toString utiliza a visitação em ordem simétrica
    @Override
    public String toString() {
        if (arvoreVazia()) return "arvore vazia";
        return toStringRec(raiz);
    }
    private String toStringRec (No atual) {
        String s = "";
        if (atual.getEsquerda() != null)
            s += toStringRec(atual.getEsquerda());
        s += atual + " ";
        if (atual.getDireita() != null)
            s += toStringRec(atual.getDireita());
        return s;
    }
    public void insereComOcorrencias (int info) {
        if (arvoreVazia()) {
            raiz =  new NoOcorrencias(info);
        }
        else {
            insereComOcorrenciasRec(info, raiz);
        }
    }
    private void insereComOcorrenciasRec (int info, No atual) {
        if (info == atual.getInfo()) {
            NoOcorrencias noOcorrencias = (NoOcorrencias)atual;
            noOcorrencias.incrementaOcorrencias();
        }
        else if (info > atual.getInfo()) {
            if (atual.getDireita() == null)
                atual.setDireita(new NoOcorrencias(info));
            else
                insereComOcorrenciasRec(info, atual.getDireita());
        }
        else {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(new NoOcorrencias(info));
            else 
                insereComOcorrenciasRec(info, atual.getEsquerda());
        }
    }
    public int altura () {
        if (arvoreVazia() || raiz.getDireita()==null && raiz.getEsquerda()== null)
            return 0;
        return alturaRec(raiz);
    }
    private int alturaRec (No atual) {
        if (atual == null || atual.getDireita() == null && atual.getEsquerda() == null)
            return 0;
        int alturaEsquerda = alturaRec(atual.getEsquerda());
        int alturaDireita = alturaRec(atual.getDireita());
        return alturaDireita > alturaEsquerda ? alturaDireita + 1 : alturaEsquerda + 1;
    }
    public boolean remove (int info) {
        if (info == raiz.getInfo()) { //elemento está na raiz da árvore
            if (raiz.getDireita() == null && raiz.getEsquerda() == null) {
                //raiz não tem filhos
                raiz = null;
            }
            else if (raiz.getDireita() == null) {
                //raiz tem só o filho da esquerda
                raiz = raiz.getEsquerda();
            }
            else if (raiz.getEsquerda() == null) {
                //raiz tem só o filho da direita
                raiz = raiz.getDireita();
            }
            else {
                //raiz tem 2 filhos
                No noSucessor = sucessor (raiz);
                noSucessor.setEsquerda(raiz.getEsquerda());
                raiz = noSucessor;
            }
            return true;
        }
        if (info > raiz.getInfo()) 
            return removeRec (info, raiz.getDireita(), raiz, true);
        return removeRec(info, raiz.getEsquerda(), raiz, false);
    }
    private boolean removeRec (int info, No atual, No pai, boolean eFilhoDireito) {
        if (atual != null) {
            if (info == atual.getInfo()) {
                if (atual.getDireita() == null && atual.getEsquerda() == null) {
                    //não tem filhos
                    if (eFilhoDireito)
                        pai.setDireita(null);
                    else 
                        pai.setEsquerda(null);
                }
                else if (atual.getDireita() == null) {
                    //tem só filho da esquerda
                    if (eFilhoDireito) 
                        pai.setDireita(atual.getEsquerda());
                    else 
                        pai.setEsquerda(atual.getEsquerda());
                }
                else if (atual.getEsquerda() == null) {
                    //tem só filho da direita
                    if (eFilhoDireito)
                        pai.setDireita(atual.getDireita());
                    else 
                        pai.setEsquerda(atual.getDireita());
                }
                else {
                    //tem os dois filhos
                    No noSucessor = sucessor(atual);
                    noSucessor.setEsquerda(atual.getEsquerda());
                    if (eFilhoDireito)
                        pai.setDireita(noSucessor);
                    else 
                        pai.setEsquerda(noSucessor);
                }
                return true;
            }
            if (info > atual.getInfo())
                return removeRec(info, atual.getDireita(), atual, true);
            return removeRec(info, atual.getEsquerda(), atual, false);
        }
        return false;
    }

    private No sucessor (No atual) {
        No suc = atual.getDireita();
        No runner = suc.getEsquerda();
        No pai = null;
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
}
