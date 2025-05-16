public class ArvoreBinaria {
    private No raiz;

    // construtor padrão
    public boolean arvoreVazia() {
        return raiz == null;
    }

    public void insere(int info) {
        No novo = new No(info);
        if (arvoreVazia())
            raiz = novo;
        else
            insereRec(novo, raiz);
    }

    public void insereOcorrencias(int info) {
        if (arvoreVazia())
            raiz = new NoOcorrencias(info);
        else
            insereOcorrenciasRec(info, raiz);
    }

    public void insereRec(No novo, No atual) {
        if (novo.getInfo() > atual.getInfo()) {
            if (atual.getDireita() == null)
                atual.setDireita(novo);
            else
                insereRec(novo, atual.getDireita());
        } else {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(novo);
            else
                insereRec(novo, atual.getEsquerda());
        }
    }

    void insereOcorrenciasRec(int info, No atual) {
        if (info == atual.getInfo()) {
            NoOcorrencias noOcorrencias = (NoOcorrencias) atual;
            noOcorrencias.incrementaOcorrencias();
        } else if (info > atual.getInfo()) {
            if (atual.getDireita() == null)
                atual.setDireita(new NoOcorrencias(info));
            else
                insereOcorrenciasRec(info, atual.getDireita());
        } else {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(new NoOcorrencias(info));
            else
                insereOcorrenciasRec(info, atual.getEsquerda());
        }
    }

    // usar o percurso em ordem simétrica para construir o toString
    @Override
    public String toString() {
        if (arvoreVazia())
            return "arvore vazia";
        return toStringRec(raiz);
    }

    private String toStringRec(No atual) {
        String s = "";
        if (atual.getEsquerda() != null)
            s = s + toStringRec(atual.getEsquerda());
        s = s + atual + " ";
        if (atual.getDireita() != null)
            s = s + toStringRec(atual.getDireita());
        return s;
    }

    public int altura() {
        if (arvoreVazia() || raiz.getDireita() == null && raiz.getEsquerda() == null) {
            return 0;
        } else {
            return alturaRec(raiz);
        }
        // return arvoreVazia() || raiz.getDireita() == null && raiz.getEsquerda() ==
        // null ? 0 : alturaRec(raiz);
    }

    private int alturaRec(No atual) {
        if (atual != null) {
            if (atual.getDireita() == null && atual.getEsquerda() == null)
                return 0;
            int alturaEsq = alturaRec(atual.getEsquerda());
            int alturaDir = alturaRec(atual.getDireita());
            return alturaDir > alturaEsq ? alturaDir + 1 : alturaEsq + 1;
        }
        return 0;
    }

    public void removeValor(int info) {
        if (arvoreVazia())
            throw new RuntimeException("falha na remocao");
        if (info == raiz.getInfo()) {
            if (raiz.getEsquerda() == null && raiz.getDireita() == null) {
                raiz = null;
            } else if (raiz.getEsquerda() == null) {
                // tem só o filho da direita
                raiz = raiz.getDireita();
            } else if (raiz.getDireita() == null) {
                // tem só o filho da esquerda
                raiz = raiz.getEsquerda();
            } else {
                // tem os 2 filhos
                No noSucessor = sucessor(raiz);
                noSucessor.setEsquerda(raiz.getEsquerda());
                raiz = noSucessor;
            }
        } else if (info > raiz.getInfo()) {
            removeValorRec(info, raiz.getDireita(), raiz, true);
        } else {
            removeValorRec(info, raiz.getEsquerda(), raiz, false);
        }
    }

    private void removeValorRec(int info, No atual, No pai, boolean eFilhoDireito) {
        if (atual != null) {
            if (info == atual.getInfo()) {
                if (atual.getDireita() == null && atual.getEsquerda() == null) {
                    if (eFilhoDireito)
                        pai.setDireita(null);
                    else
                        pai.setEsquerda(null);
                } else if (atual.getDireita() == null) {
                    if (eFilhoDireito)
                        pai.setDireita(atual.getEsquerda());
                    else
                        pai.setEsquerda(atual.getEsquerda());
                } else if (atual.getEsquerda() == null) {
                    if (eFilhoDireito)
                        pai.setDireita(atual.getDireita());
                    else
                        pai.setEsquerda(atual.getDireita());
                } else {
                    // sucessor é o menor valor maior que info
                    No sucNo = sucessor(atual);
                    sucNo.setEsquerda(atual.getEsquerda());
                    if (eFilhoDireito)
                        pai.setDireita(sucNo);
                    else
                        pai.setEsquerda(sucNo);
                }
            } else if (info > atual.getInfo()) {
                removeValorRec(info, atual.getDireita(), atual, true);
            } else {
                removeValorRec(info, atual.getEsquerda(), atual, false);
            }
        }
    }

    private No sucessor(No atual) {
        No sucNo = atual.getDireita();
        No runner = sucNo.getEsquerda();
        No pai = null;
        while (runner != null) {
            pai = sucNo;
            sucNo = runner;
            runner = runner.getEsquerda();
        }
        if (sucNo != atual.getDireita()) {
            pai.setEsquerda(sucNo.getDireita());
            sucNo.setDireita(atual.getDireita());
        }
        return sucNo;
    }
}
