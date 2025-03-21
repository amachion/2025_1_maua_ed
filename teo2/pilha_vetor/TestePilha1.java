import java.util.Random;
import java.util.Scanner;
public class TestePilha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        PilhaVetor pilha = new PilhaVetor();
        int opcao = menu(scanner);
        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    pilha.push(random.nextInt(100));
                    break;
                case 2:
                    try {
                        pilha.pop();
                    }
                    catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(pilha);
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
            opcao = menu(scanner);
        }
        System.out.println("obrigado, volte sempre!");
        scanner.close();
    }

    static int menu(Scanner scanner) {
        System.out.println("escolha uma opcao:\n");
        System.out.println("1 - empilhar\n");
        System.out.println("2 - desempilhar\n");
        System.out.println("3 - exibir\n");
        System.out.println("0 - sair\n");
        return scanner.nextInt();
    }
}
