public class NoRepeticao extends No {
    private int ocorrencias;
    public NoRepeticao (int info) {
        super(info);
        ocorrencias=1;
    }
    public int getOcorrencias() {
        return ocorrencias;
    }
    public void setOcorrencias(int ocorrencias) {
        this.ocorrencias = ocorrencias;
    }
    @Override
    public String toString() {
        return super.toString() + ", ocorre " + ocorrencias + " vezes\n";
    }
}
