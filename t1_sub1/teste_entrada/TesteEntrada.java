import java.util.Scanner;

public class TesteEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        scanner.nextLine(); //consome o <enter>
        String nome = scanner.nextLine();
        Pessoa p = new Pessoa(id, nome);
        System.out.println(p);
        scanner.close();
    }
}
