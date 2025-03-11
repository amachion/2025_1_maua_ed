import java.util.Scanner;
public class TesteVetor {
    static Scanner scanner;

    static int menu() {
        System.out.println("\nescolha:");
        System.out.println("1 - inserir");
        System.out.println("2 - remover");
        System.out.println("3 - exibir");
        System.out.println("0 - sair");
        return scanner.nextInt();
    }

    public static void main (String[] args) {
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor(4);
        scanner = new Scanner(System.in);
        // int i=10;
        // while (!v2.estaCheio()) {
        //     //System.out.println(i);
        //     v2.insere(i++);
        // }
        // System.out.println(v2);
        // System.out.println();
        // while (!v1.estaCheio()) {
        //     v1.insere(++i);
        // }
        // System.out.println(v1);

        int opcao = menu();
        while (opcao > 0) {
            switch (opcao) {
                case 1: 
                    System.out.print("digite o valor: ");
                    v1.insere(scanner.nextInt());
                    break;
                case 2: 
                    if (!v1.estaVazio())
                        System.out.println(v1.remove() + " foi removido");
                    else 
                        System.out.println("vetor vazio");
                    break;
                case 3:
                    System.out.println(v1);
                    break;
                default: 
                    System.out.println("opcao invalida!");
                    break;
            }
            opcao = menu();
        }
        System.out.println("Obrigado, volte sempre!!!");
        scanner.close();
    }
}
