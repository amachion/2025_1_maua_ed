public class ArvoreBinaria {
    private No raiz;
    //construtor padrão 
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
    //construir o toString utilizando o percurso em-ordem
    //--> esquerda + raiz + direita
    @Override
    public String toString() {
        if (arvoreVazia()) return "arvore vazia";
        return toStringRec(raiz);
    }
    private String toStringRec(No atual) {
        String s = "";
        if (atual.getEsquerda() != null)
            s += toStringRec(atual.getEsquerda());
        s += atual + " ";
        if (atual.getDireita() != null)
            s += toStringRec(atual.getDireita());
        return s;
    }
    public void insereComOcorrencias (int info) {
        if (arvoreVazia())
            raiz = new NoOcorrencias(info);
        else 
            insereComOcorrenciasRec(info, raiz);
    }
    private void insereComOcorrenciasRec(int info, No atual) {
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
        if (arvoreVazia()) return 0;
        return alturaRec(raiz);
    }
    public int alturaRec(No atual) {
        if (atual.getDireita() == null && atual.getEsquerda() == null)
            return 0;
        int alturaEsq = 0, alturaDir = 0;
        if (atual.getEsquerda() != null)
            alturaEsq = alturaRec(atual.getEsquerda());
        if (atual.getDireita() != null)
            alturaDir = alturaRec(atual.getDireita());
        return alturaDir > alturaEsq ? alturaDir + 1 : alturaEsq + 1;
    }
    public boolean remove (int info) {
        if (arvoreVazia()) throw new RuntimeException("falha na remocao");
        if (info == raiz.getInfo()) {
            if (raiz.getEsquerda() == null && raiz.getDireita() == null) {
                // não tem filhos
                raiz = null;
            }
            else if (raiz.getEsquerda() == null) {
                // tem só o filho da direita
                raiz = raiz.getDireita();
            }
            else if (raiz.getDireita() == null) {
                // tem só o filho da esquerda
                raiz = raiz.getEsquerda();
            }
            else {
                // tem os 2 filhos
                No suc = sucessor(raiz);
                suc.setEsquerda(raiz.getEsquerda());
                raiz = suc;
            }
            return true;
        }
        //chamadas recursivas
        if (info > raiz.getInfo())
            return removeRec (info, raiz.getDireita(), raiz, true);
        return removeRec (info, raiz.getEsquerda(), raiz, false);
    }
    private boolean removeRec (int info, No atual, No pai, boolean eFilhoDireita) {
        if (atual != null) {
            if (info == atual.getInfo()) {
                if (atual.getEsquerda() == null && atual.getDireita() == null) {
                    if (eFilhoDireita) 
                        pai.setDireita(null);
                    else
                        pai.setEsquerda(null);
                }
                else if (atual.getEsquerda() == null) {//só tem filho direito
                    if (eFilhoDireita) 
                        pai.setDireita(atual.getDireita());
                    else 
                        pai.setEsquerda(atual.getDireita());
                }
                else if (atual.getDireita() == null) {//só tem filho esquerdo
                    if (eFilhoDireita)
                        pai.setDireita(atual.getEsquerda());
                    else 
                        pai.setEsquerda(atual.getEsquerda());
                }
                else {
                    No suc = sucessor(atual);
                    suc.setEsquerda(atual.getEsquerda());
                    if (eFilhoDireita)
                        pai.setDireita(suc);
                    else
                        pai.setEsquerda(suc);
                }
                return true;
            }
            else {
                if (info > atual.getInfo())
                    return removeRec(info, atual.getDireita(), atual, true);
                return removeRec(info, atual.getDireita(), atual, false);
            }
        }
        return false;
    }
    private No sucessor (No atual) {
        No suc = atual.getDireita();
        No runner = suc.getEsquerda();
        No pai = null; //inicialização para poder compilar
        while (runner != null) {
            pai = suc;
            suc = runner;
            runner = runner.getEsquerda();
        }
        if (suc != atual.getDireita()){
            pai.setEsquerda(suc.getDireita());
            suc.setDireita(atual.getDireita());
        }
        return suc;
    }
}
