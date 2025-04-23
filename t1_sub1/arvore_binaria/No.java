public class No {
    private int info;
    private No esquerda;
    private No direita;
    public No (int info) {
        this.info = info;
        //por clareza
        this.esquerda = null;
        this.direita = null;
    }
    public No getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
    public No getDireita() {
        return direita;
    }
    public void setDireita(No direita) {
        this.direita = direita;
    }
    public int getInfo() {
        return info;
    }
    @Override
    public String toString() {
        return info + "";
    }
}