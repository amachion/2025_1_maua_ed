public class No <T extends Comparable<T>> {
    private T info;
    private No<T> esquerda;
    private No<T> direita;
    public No (T info) {
        this.info = info;
    }
    public No<T> getEsquerda() {
        return esquerda;
    } 
    public No<T> getDireita() {
        return direita;
    }
    public void setEsquerda (No<T> esquerda) {
        this.esquerda  = esquerda;
    }
    public void setDireita (No<T> direita) {
        this.direita = direita;
    }
    public T getInfo() {
        return info;
    }
    @Override
    public String toString() {
        return info + "";
    }
}
