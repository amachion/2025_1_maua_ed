import java.util.Random;

public class NossoVetor {
    private int[] vetor;
    private int ocupacao;

    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0;
    }

    public NossoVetor() {
        this(10);
    }

    // void aumentaVetor() {
    // int[] temp = new int[vetor.length*2];
    // for (int i=0; i < ocupacao; i++)
    // temp[i] = vetor[i];
    // vetor = temp;
    // }
    // void reduzVetor() {
    // int[] temp = new int[vetor.length / 2];
    // for (int i=0; i < ocupacao; i++)
    // temp[i] = vetor[i];
    // vetor = temp;
    // }
    void redimensionaVetor(int novoTamanho) {
        int[] temp = new int[novoTamanho];
        for (int i = 0; i < ocupacao; i++)
            temp[i] = vetor[i];
        vetor = temp;
    }

    public void insere(int i) {
        if (estaCheio()) {
            redimensionaVetor(vetor.length * 2);
        }
        vetor[ocupacao++] = i;
    }

    public boolean estaCheio() {
        return ocupacao == vetor.length;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    // public int remove () {
    // if (!estaVazio()) {
    // int aux = vetor[--ocupacao];
    // if (vetor.length >= 6 && ocupacao <= vetor.length/4)
    // redimensionaVetor(vetor.length / 2);
    // return aux;
    // }
    // return -1;
    // }
    public int remove() {
        if (estaVazio()) {
            throw new VetorVazioException("Vetor vazio, nao ha o que remover");
        }
        int aux = vetor[--ocupacao];
        if (vetor.length >= 6 && ocupacao <= vetor.length / 4) {
            redimensionaVetor(vetor.length / 2);
        }
        return aux;
    }

    public boolean contem(int elemento) {
        for (int i = 0; i < ocupacao; i++)
            if (vetor[i] == elemento)
                return true;
        return false;
    }

    public int indiceDe(int elemento) {
        if (estaVazio())
            throw new VetorVazioException("vetor esta vazio");
        for (int i = 0; i < ocupacao; i++)
            if (vetor[i] == elemento)
                return i;
        throw new ElementoNaoEncontradoException(elemento + " nao encontrado");
    }

    @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s + "\n";
    }

    public int getTamanho() {
        return vetor.length;
    }

    public void preencheVetor() {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(vetor.length * 10);
        }
        ocupacao = vetor.length;
    }

    public void bubbleSort() {
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < vetor.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < vetor.length; ++j)
                if (vetor[j] < vetor[min])
                    min = j;
            int x = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = x;
        }
    }

    public void insertionSort() {
        for (int j = 1; j < vetor.length; ++j) {
            int x = vetor[j];
            int i;
            for (i = j - 1; i >= 0 && vetor[i] > x; --i)
                vetor[i + 1] = vetor[i];
            vetor[i + 1] = x;
        }
    }

    int partition (int p, int r) { 
        int x = vetor[r];     /* O pivô é o último elemento do vetor */
        int i = p-1;
        int aux;
        for(int j = p; j < r; j++) {
            if (vetor[j] <= x) {
                aux = vetor[++i];
                vetor[i] = vetor[j]; 
                vetor[j] = aux;
            }
        }
        aux = vetor[r]; 
        vetor[r] = vetor[++i]; 
        vetor[i] = aux;
        return i;
    }
    public void quickSort(int p, int r) {
        System.out.println("p = " + p + ", r = " + r);
        if (p < r ) {
            int q = partition(p, r);
            System.out.println("q = " + q);
            quickSort(p, q-1);
            quickSort(q+1, r);
        }
    }
    public void inserirEscondidoV1 (int info) {
        if (estaVazio()) insere(info);
        else {
            if (estaCheio()) redimensionaVetor(vetor.length * 2);
            vetor[ocupacao] = vetor[ocupacao-1];
            vetor[ocupacao-1] = info;
            ocupacao++;
        }
    }
    public void inserirEscondidoV2 (int info) {
        if (estaVazio()) insere(info);
        else {
            int temp = remove();
            insere(info);
            insere(temp);
        }
    }
    public void mergeSort (int p, int r) {
        if (p < r) {
            int q = (p + r) / 2; //calcula o índice do meio
            mergeSort(p, q); //chamada recursiva para metade esquerda
            mergeSort(q+1, r); //chamada recursiva para metade direita
            merge (p, q, r); // intercala as duas metades ordenadas
        }
    }
    private void merge (int p, int q, int r) {
        int n1 = q - p + 1; // tamanho do subvetor A[p..q]
        int n2 = r - q;    // tamanho do subvetor A[q+1..r]

        // cria vetores auxiliares incluindo espaços para sentinelas
        int[] left = new int[n1+1];
        int[] right = new int[n2+1];

        //copia valores do vetor original para os auxiliares
        for (int i=0; i<n1; i++)
            left[i] = vetor[p+i];
        for (int j=0; j<n2; j++)
            right[j] = vetor[q+1 + j];
        //valores sentinela
        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;

        //intercala
        int i=0, j=0, k=p;
        while (k<=r) {
            if (left[i] <= right[j]) {
                vetor[k++] = left[i++];
            }
            else {
                vetor[k++] = right[j++];
            }
        }
    }
}

class VetorVazioException extends RuntimeException {
    public VetorVazioException(String msg) {
        super(msg);
    }
}

class ElementoNaoEncontradoException extends RuntimeException {
    public ElementoNaoEncontradoException(String msg) {
        super(msg);
    }
}