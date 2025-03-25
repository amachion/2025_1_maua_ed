public class NoDuplo {
    private int info;
    private NoDuplo anterior;
    private NoDuplo proximo;
    public NoDuplo(int info) {
        setInfo(info);
    }
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public NoDuplo getAnterior() {
        return anterior;
    }
    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
    public NoDuplo getProximo() {
        return proximo;
    }
    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        //return "NoDuplo [info=" + info + ", anterior=" + anterior + ", proximo=" + proximo + "]";
        return "[" + info + "]";
    }
    
}