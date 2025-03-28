public class Pilha {
    private No topo;
    //construtor é padrão, herdado de Object, topo = null
    //o atributo de controle topo não é visível para o cliente
    public boolean pilhaVazia () {
        return topo == null;
    }
    public void push (int info) {
        No novo = new No(info);
        if (!pilhaVazia()) {
            novo.setProximo(topo);
        }
        topo = novo;
    }
    public int pop() {
        if (pilhaVazia()) throw new RuntimeException("falha no desempilhamento");
        int temp = topo.getInfo();
        topo = topo.getProximo();
        return temp;
    }
    public int peek () {
        if (pilhaVazia()) throw new RuntimeException("falaha na consulta");
        return topo.getInfo();
    }
    @Override
    public String toString() {
        if (pilhaVazia()) return "pilha vazia\n";
        String s = "-------\n";
        No runner = topo;
        while (runner != null) {
            s += runner + "\n";
            runner = runner.getProximo(); 
        }
        return s + "\n";
    }
    public void invertePilha() {
        Pilha aux = new Pilha();
        while (!pilhaVazia()) {
            aux.push(this.pop());
        }
        this.topo = aux.topo;
    }
}

class No {
    private int info;
    private No proximo;
    public No(int info) {
        this.info = info;
    }
    public int getInfo() {
        return info;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString () {
        return "[" + info + "]";
    }
}