import java.util.Scanner;
public class TesteNossoVetor {
    static Scanner scanner;

    static int menu() {
      System.out.println("\nescolha:");
      System.out.println("1 - inserir");
      System.out.println("2 - remover");
      System.out.println("3 - exibir");
      System.out.println("0 - sair");
      return scanner.nextInt();
    }

  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    System.out.println("escolha o tamanho do vetor, 0 para o padrao");
    int tamanho = scanner.nextInt();
    NossoVetor v1 = new NossoVetor(tamanho);
    // int i=10;
    // while (!v1.estaCheio())
    //   v1.inserir(i++);
    // System.out.println(v1);
    int opcao = menu();
    while (opcao > 0) {
      switch (opcao) {
        case 1: 
          System.out.print("digite o valor: ");
          v1.inserir(scanner.nextInt());
          break;
        case 2:
          if (!v1.estaVazio()) {
            System.out.println(v1.remover() + " foi removido");
          }
          else {
            System.out.println("vetor esta vazio");
          }
          break;
        case 3: 
          System.out.println(v1);
          break;
        default: 
          System.out.println("opcao invalida!!!");
          break;
      }
      opcao = menu();
    }
    System.out.println("Obrigado, volte sempre!!");
    scanner.close();
  }
}