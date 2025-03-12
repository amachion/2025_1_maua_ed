public class NossoVetor {
    private int ocupacao;
    private int[] vetor;
    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0; //por clareza
    }
    public NossoVetor() {
        this(10);
    }
    // public boolean insere (int i) {
    //     if (!estaCheio()) {
    //         vetor[ocupacao++] = i;
    //         return true;
    //     }
    //     return false;
    // }
    public void insere (int i) {
        if (estaCheio()) redimensionaVetor(vetor.length*2);
        vetor[ocupacao++] = i;
    }
    boolean estaCheio() {
        return ocupacao == vetor.length;
    }
    public boolean estaVazio() {
        return ocupacao==0;
    }
    // public int remove () {
    //     if (!estaVazio()) {
    //         return vetor[--ocupacao];
    //     }
    //     return -1;
    // }
    public int remove() {
        int i = -1;
        if (!estaVazio()) {
            i = vetor[--ocupacao];
            if (vetor.length >= 4 && ocupacao <= vetor.length/4) 
                redimensionaVetor(vetor.length/2);
        }
        return i;
    }
    public String toString () {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i=0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s + "\n";
    }
    // private void dobraVetor () {
    //     int[] temp = new int[vetor.length*2];
    //     for (int i=0; i < ocupacao; i++) 
    //         temp[i] = vetor[i];
    //     vetor = temp;
    // }
    // private void reduzVetor () {
    //     int[] temp = new int[vetor.length/2];
    //     for (int i=0; i < ocupacao; i++)
    //         temp[i] = vetor[i];
    //     vetor = temp;
    // }
    private void redimensionaVetor (int novoTamanho) {
        int[] temp = new int[novoTamanho];
        for (int i=0; i < ocupacao; i++) 
            temp[i] = vetor[i];
        vetor = temp;
    }

    public int getTamanho () {
        return vetor.length;
    }
}