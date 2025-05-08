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
    //o método to String utiliza a visitação em-ordem
    @Override
    public String toString () {
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
    public void insereOcorrencias (int info) {
        if (arvoreVazia()) {
            raiz = new NoOcorrencias(info);
        }
        else {
            insereOcorrenciasRec(info, raiz);
        }
    }
    private void insereOcorrenciasRec (int info, No atual){
        if (info == atual.getInfo()) {
            NoOcorrencias atualOcorrencias = (NoOcorrencias)atual;
            atualOcorrencias.incrementaOcorrencias();
        }
        else if (info > atual.getInfo()) {
            if (atual.getDireita() == null)
                atual.setDireita(new NoOcorrencias(info));
            else
                insereOcorrenciasRec(info, atual.getDireita());
        }
        else {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(new NoOcorrencias(info));
            else
                insereOcorrenciasRec(info, atual.getEsquerda());
        }
    }
    public int altura () {
        if (arvoreVazia()) return 0;
        return alturaRec(raiz);
    }
    private int alturaRec(No atual) {
        if (atual.getDireita() == null && atual.getEsquerda() == null)
            return 0;
        int alturaEsquerda = 0, alturaDireita = 0;
        if (atual.getEsquerda() != null)
            alturaEsquerda = alturaRec(atual.getEsquerda());
        if (atual.getDireita() != null)
            alturaDireita = alturaRec(atual.getDireita());
        return alturaDireita > alturaEsquerda ? alturaDireita + 1 : alturaEsquerda + 1;
    }
    public boolean remove (int info) {
        if (arvoreVazia()) throw new RuntimeException("falha na remocao");
        if (info == raiz.getInfo()) {
            if (raiz.getEsquerda()==null && raiz.getDireita()==null) {
                //não tem filhos
                raiz = null;
            }
            else if (raiz.getEsquerda()==null) {
                //só tem filho da direita
                raiz = raiz.getDireita();
            }
            else if (raiz.getDireita()==null) {
                //só tem filho da esquerda
                raiz = raiz.getEsquerda();
            }
            else {
                //tem dois filhos
                No suc = sucessor(raiz);
                suc.setEsquerda(raiz.getEsquerda());
                raiz = suc;
            }
            return true;
        }
        
        if (info > raiz.getInfo()) 
            return removeRec (info, raiz.getDireita(), raiz, true);
        return removeRec (info, raiz.getEsquerda(), raiz, false);
    }
    private boolean removeRec (int info, No atual, No pai, boolean eFilhoDireito) {
        if (atual != null) {
            if (info == atual.getInfo()) {
                if (atual.getEsquerda()==null && atual.getDireita() == null) {
                    //atual não tem filhos
                    if (eFilhoDireito)
                        pai.setDireita(null);
                    else 
                        pai.setEsquerda(null);
                }
                else if (atual.getEsquerda() == null) {
                    //atual tem só o filho da direita
                    if (eFilhoDireito) 
                        pai.setDireita(atual.getDireita());
                    else
                        pai.setEsquerda(atual.getDireita());
                }
                else if (atual.getDireita() == null) {
                    //atual tem só o filho da esquerda
                    if (eFilhoDireito)
                        pai.setDireita(atual.getEsquerda());
                    else 
                        pai.setEsquerda(atual.getEsquerda());
                }
                else {
                    //atual tem os dois filhos
                    No suc = sucessor(atual);
                    suc.setEsquerda(atual.getEsquerda());
                    if (eFilhoDireito)
                        pai.setDireita(suc);
                    else 
                        pai.setEsquerda(suc);
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
        No pai = atual;
        No suc = atual.getDireita();
        No runner = suc.getEsquerda();
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
