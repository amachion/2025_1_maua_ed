import java.util.Random;
public class NossoVetor {
  private int ocupacao;
  private int[] vetor;

  public NossoVetor(int tamanho) {
    vetor = new int[tamanho];
    ocupacao = 0;
  }

  public NossoVetor() {
    this(10);
  }

  public void inserir(int i) {
    if (estaCheio())
      redimensiona(vetor.length * 2);
    vetor[ocupacao++] = i;
  }

  public int getTamanho() {
    return vetor.length;
  }
  // public int remover() {
  // if (!estaVazio()) {
  // int aux = vetor[--ocupacao];
  // if (vetor.length >= 6 && ocupacao <= vetor.length / 4)
  // redimensiona(vetor.length / 2);
  // return aux;
  // }
  // else
  // return -1;
  // }

  public int remover() {
    if (estaVazio())
      throw new VetorVazioException("vetor vazio, nao ha o que remover");
    int aux = vetor[--ocupacao];
    if (vetor.length >= 6 && ocupacao <= vetor.length / 4)
      redimensiona(vetor.length / 2);
    return aux;
  }

  public boolean estaCheio() {
    return ocupacao == vetor.length;
  }

  public boolean estaVazio() {
    return ocupacao == 0;
  }

  // private void dobraVetor () {
  // int[] temp = new int[vetor.length*2]; //temporário alocado com o dobro do
  // tamanho
  // for (int i=0; i < ocupacao; i++) { //copiando elementos do vetor para o
  // temporário
  // temp[i] = vetor[i];
  // }
  // vetor = temp; //a variável de referência vetor "aponta" para a região
  // "temporária"
  // }
  // private void reduzVetor() {
  // int[] temp = new int[vetor.length/2];
  // for (int i=0; i< ocupacao; i++) {
  // temp[i] = vetor[i];
  // }
  // vetor = temp;
  // }
  private void redimensiona(int novoTamanho) {
    int[] temp = new int[novoTamanho];
    for (int i = 0; i < ocupacao; i++) {
      temp[i] = vetor[i];
    }
    vetor = temp;
  }

  @Override
  public String toString() {
    String s = "ocupacao = " + ocupacao + "\n";
    for (int i = 0; i < ocupacao; i++) {
      s += vetor[i] + " ";
    }
    return s + "\n";
  }

  public boolean contem (int i) {
    for (int j=0; j < ocupacao; j++)
      if (vetor[j] == i)
        return true;
    return false;
  }
  public int indiceDe (int i) {
    for (int j=0; j < ocupacao; j++)
      if (vetor[j] == i)
        return j;
    return -1;
  }

  public void preecheVetor () {
    Random random = new Random();
    for (int i=0; i<vetor.length; i++) {
      vetor[i] = random.nextInt(vetor.length * 10);
    }
    ocupacao = vetor.length;
  }
  public void bubbleSort () {
    for (int i=1; i<vetor.length; i++) {
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

class VetorVazioException extends RuntimeException {
  public VetorVazioException(String msg) {
    super(msg);
  }
}