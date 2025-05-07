import java.util.Scanner;

public class TesteEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        int id = scanner.nextInt();
        Pessoa p = new Pessoa(id, nome);
        System.out.println(p);
        scanner.nextLine();
        nome = scanner.nextLine();//consome o <enter> depois do int
        id = scanner.nextInt();
        p = new Pessoa(id, nome);
        System.out.println(p);
        scanner.close();
    }
}
