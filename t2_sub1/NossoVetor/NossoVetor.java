import java.util.Random;

public class NossoVetor {
    private int ocupacao;
    private int[] vetor;   
    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0;
    }
    public NossoVetor() {
        //this(10, 20);
        this(10);
    }
    // public NossoVetor (int a, int b) {
    //     ocupacao = a;
    //     vetor = new int[b];
    // }
    public boolean estaCheio() {
        return ocupacao == vetor.length;
    }
    public boolean estaVazio() {
        return ocupacao == 0;
    }
    public void insere(int i) {
        if (estaCheio()) redimensiona(vetor.length * 2);
        vetor[ocupacao++] = i;
    }
    public int getTamanho () {
        return vetor.length;
    }
    @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s;
    }
    // public int remove () {
    //     if (!estaVazio()) {
    //         int aux = vetor[--ocupacao];
    //         if (vetor.length >= 6 && ocupacao <= vetor.length / 4) 
    //             redimensiona(vetor.length / 2);
    //         return aux;
    //     }
    //     return -1;
    // }
    public int remove() {
        if (estaVazio()) {
            throw new VetorVazioException("Vetor vazio, nao ha o que remover");
        }
        int aux = vetor [--ocupacao];
        if (vetor.length >= 6 && ocupacao <= vetor.length / 4) {
            redimensiona(vetor.length / 2);
        }
        return aux;
    }
    // private void dobraVetor () {
    //     int[] temp = new int[vetor.length*2];
    //     for (int i=0; i<ocupacao; i++) {
    //         temp[i] = vetor[i];
    //     }
    //     vetor = temp;
    // }
    // private void reduzVetor () {
    //     int[] temp = new int[vetor.length/2];
    //     for (int i=0; i < ocupacao; i++) {
    //         temp[i] = vetor[i];
    //     }
    //     vetor = temp;
    // }
    private void redimensiona (int novoTamanho) {
        int[] temp = new int[novoTamanho];
        for (int i=0; i<ocupacao; i++) {
            temp[i] = vetor[i];
        }
        vetor = temp;
    }
    public void preencheVetor () {
        Random random = new Random();
        for (int i=0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(vetor.length * 10);
        }
        ocupacao = vetor.length;
    }

    public boolean contem (int elemento) {
        for (int i=0; i<ocupacao; i++) 
            if (elemento == vetor[i])
                return true;
        return false;
    }
    public int indiceDe (int elemento) {
        if (estaVazio())
            throw new VetorVazioException("vetor esta vazio");
        for (int i=0; i<ocupacao; i++)
            if (elemento == vetor[i])
                return i;
        throw new ElementoNaoEncontradoException("elemento nao encontrado");
    }
    public void bubbleSort () {
        for (int i=1; i < vetor.length; i++) {
            for (int j=0; j < vetor.length - i; j++) {
                if (vetor[j] > vetor[j+1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }
}

class VetorVazioException extends RuntimeException{
    public VetorVazioException(String msg) {
        super(msg);
    }
}
class ElementoNaoEncontradoException extends RuntimeException {
    public ElementoNaoEncontradoException (String msg) {
        super(msg);
    }
}