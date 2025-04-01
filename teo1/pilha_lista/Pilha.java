public class Pilha {
    private No topo;
    //lembrem-se, temos o construtor padrão, herdado de Object

    public void push (char info) {
        No novo = new No(info);
        if (!pilhaVazia()) {
            novo.setProximo(topo);
        }
        topo = novo;
    }
    public boolean pilhaVazia() {
        return topo == null;
    }
    public char pop() {
        if (pilhaVazia())
            throw new RuntimeException("pilha vazia, falha no pop");
        char info = topo.getInfo();
        topo = topo.getProximo();
        return info;
    }
    public char peek () {
        //consulta o elemento do topo, sem desmpilhar
        if (pilhaVazia()) 
            throw new RuntimeException("pilha vazia");
        return topo.getInfo();
    }
    public void invertePilha() {
        //inverte a pilha 
        Pilha p = new Pilha();
        while (!pilhaVazia()) {
            p.push(this.pop());
        }
        this.topo = p.topo;
    }
}
class No {
    private char info;
    private No proximo;
    public No(char info) {
        this.info = info;
    }
    public char getInfo() {
        return info;
    }
    public void setInfo(char info) {
        this.info = info;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return "[" + info + "]";
    }
    
}
