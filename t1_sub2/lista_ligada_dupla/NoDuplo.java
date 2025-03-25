public class NoDuplo {
    private int info;
    private NoDuplo proximo;
    private NoDuplo anterior;
    public NoDuplo (int info) {
        setInfo(info);
        setAnterior(null);
        setProximo(null);
    }
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public NoDuplo getProximo() {
        return proximo;
    }
    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }
    public NoDuplo getAnterior() {
        return anterior;
    }
    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
    @Override
    public String toString() {
        return "[" + info + "]";
    }
    
}